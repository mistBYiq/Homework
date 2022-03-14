package main.java.com.mistiq.classwork.work_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpDemo {
    public static final String REGEXP = "[a-z.@]+";
    public static final String TEST_TEXT = "viachaslauk.it@gmail.com";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEXP);
        Matcher matcher = pattern.matcher(TEST_TEXT);

        //System.out.println(matcher.results().map(MatchResult::group).collect(Collectors.joining(",")));

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}