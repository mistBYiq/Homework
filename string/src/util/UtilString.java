package util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilString {
    public static final String REGEXP_PUNCTUATION_SYMBOLS = "[,.!?;:]";
    public static final String REGEXP_NUMBER = "(\\b[^\\D]\\S+\\b)";
    public static final String REGEXP_ONLY_DIGITS = "[\\d]+";
    public static final String REGEXP_ONLY_WORD = "([^\\d\\s.,()*]+|(?<!\\d\\\\.\\d)\\\\)";
    public static final String REGEXP_SENTENCE= "([^.!?]+[.!?])";
    public static final String REGEXP_LETTER = "([a-zA-Z])";
    public static final String REGEXP_VOWELS = "([aAeEiIuUoO])";
    public static String convertUppercaseFirstLetter(String text) {
        char[] charArrayText = text.toCharArray();
        StringBuilder resultBuilder = new StringBuilder();

        // Determine if the specified character (Unicode code point) is an alphabet.
        if (Character.isAlphabetic(charArrayText[0])) {
            charArrayText[0] = Character.toUpperCase(charArrayText[0]);
        }
        resultBuilder.append(charArrayText[0]);
        for (int i = 1; i < charArrayText.length; i++) {
            // determine that this is the first character in the word and convert it to uppercase
            if (Character.isAlphabetic(charArrayText[i]) && !Character.isAlphabetic(charArrayText[i - 1])) {
                charArrayText[i] = Character.toUpperCase(charArrayText[i]);
            }
            resultBuilder.append(charArrayText[i]);
        }

        return resultBuilder.toString();
    }

    public static void countPunctuationMarks(String text) {
        int allSymbols = text.length();
        int noPunctuationSymbols = text.replaceAll(REGEXP_PUNCTUATION_SYMBOLS, "").length();
        System.out.println("The number of punctuation marks in the text : " + (allSymbols - noPunctuationSymbols));
    }

    public static void determineSumAllIntegers(String text) {
        Pattern patternNumber = Pattern.compile(REGEXP_NUMBER, Pattern.MULTILINE);
        Matcher matcherNumber = patternNumber.matcher(text);
        int sum = 0;

        while (matcherNumber.find()) {
            for (int i = 0; i < matcherNumber.groupCount(); i++) {
                if (matcherNumber.group(i).matches(REGEXP_ONLY_DIGITS)) {
                    sum += Integer.parseInt(matcherNumber.group(i));
                }
            }
        }
        System.out.println("Sum of all integers = " + sum);
    }

    public static void replaceWithGivenCharacter(String text, int length, char givenCharacter) {
        // ([^\d\s.,]{3,}|(?<!\d\\.\d)\\)
        final String REGEXP_WORD_GIVEN_LENGTH = "([^\\d\\s.,]{" + length + ",}|(?<!\\d\\\\.\\d)\\\\)";
        Pattern patternWord = Pattern.compile(REGEXP_WORD_GIVEN_LENGTH, Pattern.MULTILINE);
        Matcher matcherWord = patternWord.matcher(text);

        while (matcherWord.find()) {
            for (int i = 0; i < matcherWord.groupCount(); i++) {
                String regex = (matcherWord.group(i));
                String replacement = (matcherWord.group(i).substring(0, length -1) + givenCharacter
                        + matcherWord.group(i).substring(length));
                text = text.replaceFirst(regex, replacement);
            }
        }
        System.out.println("\nText after replacing characters :");
        System.out.println(text);
    }

    public static String deleteTextBetweenCharacters(String text, char start, char end) {
        final String REGEXP_SOME_CHAR = "[" + start + "\"].*[" + end + "\"]";
        return text.replaceAll(REGEXP_SOME_CHAR, "");

    }

    public static void showHowManyWordRepeated(String text) {
        Pattern patternWord = Pattern.compile(REGEXP_ONLY_WORD, Pattern.MULTILINE);
        Matcher matcherWord = patternWord.matcher(text);
        Map<String,Integer> counterWordMap = new HashMap<>();

        while (matcherWord.find()) {
            for (int i = 0; i < matcherWord.groupCount(); i++) {
                if (!matcherWord.group(i).isEmpty()) {
                    String temp = matcherWord.group(i).toLowerCase();
                    Integer count = counterWordMap.get(temp);
                    if (count == null) {
                        count = 0;
                    }
                    counterWordMap.put(temp, ++count);
                }
            }
        }

        for (String word : counterWordMap.keySet()) {
            System.out.println(word + " : " + counterWordMap.get(word));
        }
    }

    public static void findWhichLettersMore(String text) {
        Pattern patternSentence = Pattern.compile(REGEXP_SENTENCE, Pattern.MULTILINE);
        Matcher matcherSentence = patternSentence.matcher(text);
        int numSentence = 0;

        while (matcherSentence.find()) {
            for (int i = 0; i < matcherSentence.groupCount(); i++) {
                String sentence = matcherSentence.group(i);
                double letters = countUpLetters(sentence);
                double vowels = countUpVowels(sentence);
                double percentVowels = vowels * 100 / letters;
                System.out.println("In sentence (" + ++numSentence + ") "
                        + percentVowels + "% vowels " + "  :  "
                        + (100 - percentVowels) + "% consonants ");
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

    public static void findUniqueWordsInterrogativeSentences(String text, int length) {
        Pattern patternInterrogative = Pattern.compile("([^.!?\\n\\t]+[?])", Pattern.MULTILINE);
        Matcher matcherInterrogative = patternInterrogative.matcher(text);
        int countSentence = 0;

        while (matcherInterrogative.find()) {
            for (int i = 0; i < matcherInterrogative.groupCount(); i++) {
                System.out.println("In Interrogative Sentence (" + ++countSentence + ")  unique words given length : ");
                showUniqueWordGivenLength(matcherInterrogative.group(i), length);
            }
        }
    }

    public static void showUniqueWordGivenLength(String text, int length) {
        final String REGEXP_WORD_GIVEN_LENGTH = "([^\\d\\s.,()*]{" + length + ",}|(?<!\\d\\\\.\\d)\\\\)";
        Pattern patternWord = Pattern.compile(REGEXP_WORD_GIVEN_LENGTH, Pattern.MULTILINE);
        Matcher matcherWord = patternWord.matcher(text);
        Set<String> wordSet = new HashSet<>();

        while (matcherWord.find()) {
            for (int i = 0; i < matcherWord.groupCount(); i++) {
                String regex = (matcherWord.group(i));
                wordSet.add(regex);
            }
        }
        for (String word : wordSet) {
            System.out.println(word);
        }
    }



//\*(.+?\*)
}
