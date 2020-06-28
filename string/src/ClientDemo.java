import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientDemo {

    public static void main(String[] args) throws IOException {
//        CompositeText text = new CompositeText();
//        LeafWord word = new LeafWord();
//        word.setId(1L);
//        word.setValue("mama ");
//
//        LeafWord word1 = new LeafWord();
//        word1.setId(2L);
//        word1.setValue(" mula ");
//
//        LeafWord word2 = new LeafWord();
//        word2.setId(3L);
//        word2.setValue("ramy");
//
//        LeafSymbol symbol = new LeafSymbol();
//        symbol.setId(1L);
//        symbol.setValue(' ');
//
//        LeafSymbol symbol1 = new LeafSymbol();
//        symbol1.setId(2L);
//        symbol1.setValue('\n');
//
//        LeafSymbol symbol2 = new LeafSymbol();
//        symbol2.setId(3L);
//        symbol2.setValue('.');
//
//        LeafNumber number = new LeafNumber();
//        number.setId(1L);
//        number.setValue(1989);
//
//        LeafNumber number1 = new LeafNumber();
//        number1.setId(2L);
//        number1.setValue(1);
//
//        LeafNumber number2 = new LeafNumber();
//        number2.setId(3L);
//        number2.setValue(12.2);
//
//
//        text.addComponent(number1);
//        text.addComponent(symbol);
//        text.addComponent(word);
//        text.addComponent(symbol);
//        text.addComponent(number2);
//        text.addComponent(symbol);
//        text.addComponent(word1);
//        text.addComponent(symbol1);
//        text.addComponent(word2);
//        text.addComponent(symbol);
//        text.addComponent(number);
//        text.addComponent(symbol2);
//
//        //String text = "test.txt";
//
//        //Util.splitText(text);
//        List<String> list = new ArrayList<>();
//        Scanner scanner = new Scanner(new File("resources\\Cat.txt"));
//        int i = 0;
//        while (scanner.hasNext()) {
//            list.add("\t" + scanner.nextLine() + "\n");
//        }
//        scanner.close();
//
//        StringBuilder text = new StringBuilder();
//        for (String s : list) {
//            text.append(s);
//        }
//        System.out.println(text);
//
////
////        String string = " dhfbvnc , hfhec , epfkesc 1232212 asbaicuab 123,343 dhfdcjd.";
////        Pattern pattern1 = Pattern.compile("([^.!?]+[.!?])");
////        String[] array = pattern1.split(text);
////        for (String str : array) {
////            System.out.println(str);
////        }
//
//        final String regex = "[\\t\\n]";
//        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//        final Matcher matcher = pattern.matcher();
//
//        while (matcher.find()) {
//            System.out.println("Full match: " + matcher.group(0));
//            for (int i = 1; i <= matcher.groupCount(); i++) {
//                System.out.println("Group " + i + ": " + matcher.group(i));
//            }
//        }

        String stringText = "   Far too many people these days have grown used to boring, mass-produced cats, which may bounce with health and nourishing vitamins but aren't a patch on the good old cats you used to get. The Campaign for Real Cats wants to change all hat by helping people recognise Real Cats when they see them. Hence this book.";
//
//        String regexWord = "([^\\d\\s.,]+|(?<!\\d\\\\.\\d)\\\\)";
//        Pattern patternWord = Pattern.compile(regexWord,Pattern.MULTILINE);
//        Matcher matcherWord = patternWord.matcher(stringText);
//        while (matcherWord.find()) {
//            System.out.println("Full match: " + matcherWord.group(0));
//            for (int i = 1; i <= matcherWord.groupCount(); i++) {
//                System.out.println("Group " + i + ": " + matcherWord.group(i));
//            }
//        }
//        String regexSimb = "(\\W)";
//        Pattern patternSimb = Pattern.compile(regexSimb,Pattern.MULTILINE);
//        Matcher matcherSimb = patternSimb.matcher(stringText);
//        while (matcherSimb.find()) {
//            System.out.println("Full match: " + matcherSimb.group(0));
//            for (int i = 1; i <= matcherSimb.groupCount(); i++) {
//                System.out.println("Group " + i + ": " + matcherSimb.group(i));
//            }
//        }
//
        String regexAll = "(\\b\\S+\\b)|(\\s)|(\\S)|(\\b[0-9,]+.\\d+\\b)";
        Pattern patternAll = Pattern.compile(regexAll,Pattern.MULTILINE);
        Matcher matcherAll = patternAll.matcher(stringText);

        List<String> strings = new ArrayList<>();
        while (matcherAll.find()) {
            System.out.println("Full match: " + matcherAll.group(0));
            for (int i = 1; i <= matcherAll.groupCount(); i++) {
                 if (matcherAll.group(i) != null) {
                     strings.add(matcherAll.group(i));
                 }
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i));
        }


    }
}
