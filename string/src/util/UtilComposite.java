package util;

import com.sun.nio.sctp.SendFailedNotification;
import domain.composite.Component;

import domain.composite.LeafWord;
import domain.composite.NodeParagraph;
import domain.composite.NodeSentence;
import domain.composite.Text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilComposite {
    public static final String REGEXP_PUNCTUATION_SYMBOLS = "[,.!?;:]";
    public static final String REGEXP_NUMBER = "(\\b[^\\D]\\S+\\b)";
    public static final String REGEXP_ONLY_DIGITS = "[\\d]+";
    public static final String REGEXP_LETTER = "([a-zA-Z])";
    public static final String REGEXP_VOWELS = "([aAeEiIuUoO])";

    public static List<NodeParagraph> parserText(String text) {
        List<NodeParagraph> paragraphsText = new ArrayList<>();
        Pattern patternWord = Pattern.compile("((?:[^\\n][\\n]?)+)", Pattern.MULTILINE);//(?sm)^.*?\.\s*$  (^.+)
        Matcher matcherWord = patternWord.matcher(text);

        while (matcherWord.find()) {
            for (int i = 0; i < matcherWord.groupCount(); i++) {
                List<NodeSentence> sentences = splitParagraphIntoSentences(matcherWord.group(i));
                NodeParagraph nodeParagraph = new NodeParagraph(sentences);
                paragraphsText.add(nodeParagraph);
            }
        }
        return paragraphsText;
    }

    public static List<NodeSentence> splitParagraphIntoSentences(String paragraph) {
        List<NodeSentence> sentencesParagraph = new ArrayList<>();       //([^.!?]+[.!?])
        Pattern patternWord = Pattern.compile("([^.!?]+[.!?])", Pattern.MULTILINE);
        Matcher matcherWord = patternWord.matcher(paragraph);

        while (matcherWord.find()) {
            for (int i = 0; i < matcherWord.groupCount(); i++) {
                List<LeafWord> componentsSentence = splitSentenceIntoWord(matcherWord.group(i));
                NodeSentence nodeSentence = new NodeSentence(componentsSentence);
                sentencesParagraph.add(nodeSentence);
            }
        }
        return sentencesParagraph;
    }

    public static List<LeafWord> splitSentenceIntoWord(String sentence) {
        List<LeafWord> components = new ArrayList<>();
        Pattern patternWord = Pattern.compile("([^ ]+)", Pattern.MULTILINE);
        Matcher matcherWord = patternWord.matcher(sentence);

        while (matcherWord.find()) {
            for (int i = 0; i < matcherWord.groupCount(); i++) {
                components.add(new LeafWord(matcherWord.group(i)));
            }
        }
        return components;
    }

    public static String readFile(String fileName) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader(fileName);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (bufferedReader.ready()) {
                stringBuilder.append(bufferedReader.readLine());
            }
        }
        return stringBuilder.toString();
    }

    public static String openFile(String fileName) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader( new FileReader(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while(true) {
            try {
                if (!(( line = reader.readLine() ) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }

    public static void changeFirstLiteral(Text text) {
        List<NodeParagraph> paragraphs = text.getComponents();
        for (NodeParagraph paragraph : paragraphs) {
            System.out.println("\t");
            List<NodeSentence> sentences = paragraph.getComponents();
            for (NodeSentence sentence : sentences) {
                List<LeafWord> words = sentence.getComponents();
                for (LeafWord word : words) {
                    if (word.getWord() != null) {
                        toUpperCaseForFirstLetter(word.getWord());
                    }
                }
            }
        }
    }

    public static void toUpperCaseForFirstLetter(String text) {
        StringBuilder builder = new StringBuilder(text);
        if (Character.isAlphabetic(text.codePointAt(0)))
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));
        for (int i = 1; i < text.length(); i++)
            if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));

        System.out.print(builder.toString());
    }

    public static void showPunctuationMarks(Text text) {
        int allSymbols = 0;
        int noPunctuationSymbols = 0;
        List<NodeParagraph> paragraphs = text.getComponents();
        for (NodeParagraph paragraph : paragraphs) {
            System.out.println("\t");
            List<NodeSentence> sentences = paragraph.getComponents();
            for (NodeSentence sentence : sentences) {
                List<LeafWord> words = sentence.getComponents();
                for (LeafWord word : words) {
                    if (word.getWord() != null) {
                        allSymbols += word.getWord().length();
                        noPunctuationSymbols += word.getWord().replaceAll(REGEXP_PUNCTUATION_SYMBOLS, "").length();
                    }
                }
            }
        }
        System.out.println("The number of punctuation marks in the text : " + (allSymbols - noPunctuationSymbols));
    }

    public static void showSumInteger(Text text) {
        Pattern patternNumber = Pattern.compile(REGEXP_NUMBER, Pattern.MULTILINE);
        int sum = 0;
        List<NodeParagraph> paragraphs = text.getComponents();
        for (NodeParagraph paragraph : paragraphs) {
            System.out.println("\t");
            List<NodeSentence> sentences = paragraph.getComponents();
            for (NodeSentence sentence : sentences) {
                List<LeafWord> words = sentence.getComponents();
                for (LeafWord word : words) {
                    if (word.getWord() != null) {
                        Matcher matcherNumber = patternNumber.matcher(word.getWord());
                        while (matcherNumber.find()) {
                            for (int i = 0; i < matcherNumber.groupCount(); i++) {
                                if (matcherNumber.group(i).matches(REGEXP_ONLY_DIGITS)) {
                                    sum += Integer.parseInt(matcherNumber.group(i));
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Sum of all integers = " + sum);
    }

    public static void replaceWithGivenCharacter(Text text, int length, char givenCharacter) {
        List<NodeParagraph> paragraphs = text.getComponents();
        for (NodeParagraph paragraph : paragraphs) {
            List<NodeSentence> sentences = paragraph.getComponents();
            for (NodeSentence sentence : sentences) {
                List<LeafWord> words = sentence.getComponents();
                for (LeafWord word : words) {
                    if ((word.getWord() != null)
                            && (word.getWord().length() >= length)
                            && (!word.getWord().matches("[0-9]+"))) {
                        String regex = (word.getWord());
                        String replacement = (word.getWord().substring(0, length - 1) + givenCharacter
                                + word.getWord().substring(length));
                        System.out.println();
                        word.setWord( word.getWord().replace(regex, replacement));
                    }
                }
            }
        }
        text.show();
    }

    public static void deleteTextBetweenCharacters(Text text, String start,  String end) {
        boolean count = false;
        List<NodeParagraph> paragraphs = text.getComponents();
        for (NodeParagraph paragraph : paragraphs) {
            List<NodeSentence> sentences = paragraph.getComponents();
            for (NodeSentence sentence : sentences) {
                List<LeafWord> words = sentence.getComponents();
                List<LeafWord> components = new ArrayList<>();
                for (LeafWord word : words) {
                    if(word.getWord().contains(start)) {
                        count = true;
                    }
                    if(count) {
                        components.add(word);
                    }
                    if(word.getWord().contains(end)) {
                        count = false;
                    }
                }
                System.out.println(components.toString());
                sentence.removeComponents(components);
            }
        }
        text.show();
    }

    public static void showHowManyWordRepeated(Text text) {
        Map<String, Integer> counterWordMap = new HashMap<>();
        List<NodeParagraph> paragraphs = text.getComponents();
        for (NodeParagraph paragraph : paragraphs) {
            List<NodeSentence> sentences = paragraph.getComponents();

            for (NodeSentence sentence : sentences) {
                List<LeafWord> words = sentence.getComponents();

                for (LeafWord word : words) {
                    if (word.getWord() != null) {
                        String temp = word.getWord().toLowerCase();
                        Integer count = counterWordMap.get(temp);
                        if (count == null) {
                            count = 0;
                        }
                        counterWordMap.put(temp, ++count);
                    }
                }
            }
        }
        for (String word : counterWordMap.keySet()) {
            System.out.println(word + " : " + counterWordMap.get(word));
        }
    }

    public static void findWhichLettersMore(Text text) {
        int numSentence = 0;
        List<NodeParagraph> paragraphs = text.getComponents();
        for (NodeParagraph paragraph : paragraphs) {
            List<NodeSentence> sentences = paragraph.getComponents();
            for (NodeSentence sentence : sentences) {
                double letters = 0;
                double vowels = 0;

                List<LeafWord> words = sentence.getComponents();
                for (LeafWord word : words) {
                    if (word.getWord() != null) {
                        letters += countUpLetters(word.getWord());
                        vowels += countUpVowels(word.getWord());
                    }
                }
                if (letters != 0) {
                    try {
                        double percentVowels = (vowels * 100) / letters;
                        System.out.println("In sentence (" + ++numSentence + ") "
                                + percentVowels + "% vowels " + "  :  "
                                + (100 - percentVowels) + "% consonants ");
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("In sentence (" + ++numSentence + ") Error! check regex for sentences");
                }
            }
        }
    }

    public static int countUpLetters(String sentence){
        Pattern patternLetter = Pattern.compile(REGEXP_LETTER, Pattern.MULTILINE);
        Matcher matcherLetter = patternLetter.matcher(sentence);
        int count = 0;
        while (matcherLetter.find()) {
            for (int i = 0; i < matcherLetter.groupCount(); i++) {
                count++;
            }
        }
        return count;
    }

    public static int countUpVowels(String sentence){
        Pattern patternVowels = Pattern.compile(REGEXP_VOWELS, Pattern.MULTILINE);
        Matcher matcherVowels = patternVowels.matcher(sentence);
        int count = 0;
        while (matcherVowels.find()) {
            for (int i = 0; i < matcherVowels.groupCount(); i++) {
                count++;
            }
        }
        return count;
    }

    public static void findUniqueWordsInterrogativeSentences(Text text, int length) {
        List<NodeSentence> sentencesInterrogative = new ArrayList<>();
        List<NodeParagraph> paragraphs = text.getComponents();
        for (NodeParagraph paragraph : paragraphs) {
            System.out.println("\t");
            List<NodeSentence> sentences = paragraph.getComponents();
            for (NodeSentence sentence : sentences) {
                List<LeafWord> words = sentence.getComponents();
                for (LeafWord word : words) {
                    if ((word.getWord() != null) && (word.getWord().matches("(\\?)")))  {
                       sentencesInterrogative.add(sentence);
                    }
                }
            }
        }
        int countSentence = 0;
        for (NodeSentence nodeSentence : sentencesInterrogative) {
            System.out.println("In Interrogative Sentence (" + ++countSentence
                    + ")  unique words given length : ");
            showUniqueWordGivenLength(nodeSentence, length);
        }
    }

    public static void showUniqueWordGivenLength(NodeSentence sentence, int length) {
        Set<String> wordSet = new HashSet<>();
        List<LeafWord> words = sentence.getComponents();
        for (LeafWord word : words) {
            if ((word.getWord() != null) && (word.getWord().length() >= length))  {
                wordSet.add(word.getWord());
            }
        }
        for (String word : wordSet) {
            System.out.println(word);
        }
    }


}
