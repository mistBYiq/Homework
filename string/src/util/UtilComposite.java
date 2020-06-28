package util;

import domain.compositeOne.CompositeText;
import domain.compositeOne.NodeParagraph;
import domain.compositeOne.NodeSentence;

import java.util.regex.Pattern;

public class UtilComposite {

    //"\\s*(\\s|,|!|\\.)\\s*"

    public static CompositeText splitText(String text) {
        CompositeText compositeText = new CompositeText();
        Pattern patternParagraph = Pattern.compile("[\t\n]"); //(^\t.+)
        String[] paragraphs = patternParagraph.split(text);
        for (String paragraph : paragraphs) {
            NodeParagraph nodeParagraph = splitParagraphIntoSentences(paragraph);
            compositeText.addComponent(nodeParagraph);
        }
        return compositeText;
    }

    public static NodeParagraph splitParagraphIntoSentences(String paragraph) {
        NodeParagraph nodeParagraph = new NodeParagraph();
        Pattern patternSentence = Pattern.compile("([^.!?]+[.!?])"); //([^.!?]+[.!?])
        String[] sentences = patternSentence.split(paragraph);
        for (String sentence : sentences) {
            NodeSentence nodeSentence = splitSentenceIntoComponent(sentence);
            nodeParagraph.addComponent(nodeSentence);
        }
        return nodeParagraph;
    }

    public static NodeSentence splitSentenceIntoComponent(String sentence) {
        NodeSentence nodeSentence = new NodeSentence();
        Pattern patternNumber = Pattern.compile("(\\b\\S+\\b)|(\\s)|(\\S)|(\\b[0-9,]+.\\d+\\b)");

        return nodeSentence;
    }
//(\b\S+[^ \d]\b)|(\s)|(\S)|(\b[0-9,]+.\d+\b)

    //(\b\S+\b)|(\s)|(\S)|(\b[0-9,]+.\d+\b)
    //(\b\S+\b)

    //([^\d\s.]+|(?<!\d\\.\d)\\.\\,) num--
    //([-+]?\b[^\D]\S+\b) num

      //      ([^\d\s.,]+|(?<!\d\\.\d)\\) word
    //\W(?!\d) sim
    //(^\t.+$\n) paragr
    //([^.!?]+[.!?]) sen
    //(\b\S+\b)|(\s)|(\S)|(\b[0-9,]+.\d+\b) components
}
