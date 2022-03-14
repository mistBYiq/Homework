package main.java.com.mistiq.homework.string.util;


import main.java.com.mistiq.homework.string.domain.compositeTwo.Component;
import main.java.com.mistiq.homework.string.domain.compositeTwo.Composite;
import main.java.com.mistiq.homework.string.domain.compositeTwo.Leaf;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilCompositeTwo {
    public static final String REGEXP_PARAGRAPH = "(^\\t.+$\\n)";
    public static final String REGEXP_SENTENCE = "([^.!?]+[.!?])";
    public static final String REGEXP_COMPONENT = "(\\b\\S+\\b)|(\\s)|(\\S)|(\\b[0-9,]+.\\d+\\b)";

    public static Composite splitParagraph(String text) {
        Composite composite = new Composite();

        Pattern patternParagraph = Pattern.compile(REGEXP_PARAGRAPH, Pattern.MULTILINE);
        Matcher matcherParagraph = patternParagraph.matcher(text);
        while (matcherParagraph.find()) {
            for (int i = 0; i <= matcherParagraph.groupCount(); i++) {
                if (matcherParagraph.group(i) != null) {
                    composite.addComponent(splitSentence(matcherParagraph.group(i)));
                }
            }
        }
        return composite;
    }

    public static Composite splitSentence(String text) {
        Composite composite = new Composite();

        Pattern patternSentence = Pattern.compile(REGEXP_SENTENCE, Pattern.MULTILINE);
        Matcher matcherSentence = patternSentence.matcher(text);
        while (matcherSentence.find()) {
            for (int i = 0; i <= matcherSentence.groupCount(); i++) {
                String temp = matcherSentence.group(i);
                if (temp != null) {
                    composite.addComponent(splitComponents(temp, composite));
                }
            }
        }
        return composite;
    }

    public static Component splitComponents(String text, Composite component) {

        Pattern patternComponent = Pattern.compile(REGEXP_COMPONENT, Pattern.MULTILINE);
        Matcher matcherComponent = patternComponent.matcher(text);
        while (matcherComponent.find()) {
            for (int i = 0; i < matcherComponent.groupCount(); i++) {

                if (matcherComponent.group(i) != null) {
                    Leaf leaf = new Leaf();
                    leaf.setId();
                    leaf.setValue(matcherComponent.group(i));
                    component.addComponent(leaf);
                }
            }
        }
        return component;
    }

    public static Leaf addLeaf(String value) {
        Leaf leaf = new Leaf();
        leaf.setId();
        leaf.setValue(value);

        return leaf;
    }

}
