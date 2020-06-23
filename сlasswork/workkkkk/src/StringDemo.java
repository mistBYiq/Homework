import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringDemo {
    public static void main(String[] args) {
        String s = "asdasd";
        String stringNewTest = new String("asdasd");
        String s1 = "";
        String s2 = null;
        String s3 = new String("testpool");

        //s += "222"; //asdasd222 - second object, asdasd - first object

        s2 = "asdasd";

        System.out.println(s == stringNewTest);
        System.out.println(s.equals(stringNewTest));
        System.out.println(s == s2);
        System.out.println(s.equals(s2));

        stringNewTest = stringNewTest.intern();

        System.out.println(s == stringNewTest);
        System.out.println(s.equals(stringNewTest));

        String qweqwe = new String("qweqwe");
        String s4 = new String(s);

        char[] word = {'w', 'o', 'r', 'd'};
        System.out.println(new String(word));
        System.out.println(new String(word, 2, 2));

        byte[] bytes = {85, 52, 75, 86};
        System.out.println(new String(bytes).length());
        System.out.println(new String(bytes).toCharArray());
        System.out.println(new String(bytes));
        System.out.println(new String(bytes));
        System.out.println(new String(bytes));

        System.out.println("QWE".equalsIgnoreCase("qwe"));
        System.out.println("qwe".toUpperCase());
        System.out.println("QWE".toLowerCase());
        System.out.println("       werty       ".trim());
        System.out.println("       werty       1");
        System.out.println("qwe" + "asd");
        System.out.println("qwe".concat("asd"));
        System.out.println("qwe".indexOf(""));
        System.out.println("qwe".replace("we", "111"));
        System.out.println("qwe".startsWith("qq"));
        System.out.println("qwe".endsWith("qq"));
        System.out.println("qwe".contains("qq"));

        String[] split = "qwe, qweasdasdklas, dsfsd. fsdfs, sdkfjskd! fjlskdf".split("!");
        for (String s5 : split) {
            System.out.println(s5.trim());
        }

        char[] testString = {'q', 'w', 'e'};

        List<String> stringList = Arrays.asList("Мама", "мыла", "раму");
        String collect = stringList.stream().collect(Collectors.joining(" "));
        System.out.println(collect);

        String result = "";
        for (String s5 : stringList) {
            result += s5 + " ";
        }

        System.out.println(result.trim());

        String subSequence = "123123 text 123123";
        int firstSymbol = subSequence.indexOf("t");
        int last = subSequence.lastIndexOf("t");

        System.out.println("123123 text 123123".subSequence(firstSymbol, last + 1));

        String s5 = new StringBuffer()
                .append("asdasdasd")
                .append("asdasd")
                .toString();

        System.out.println(s5);


    }
}