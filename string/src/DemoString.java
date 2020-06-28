import util.UtilString;

public class DemoString {
    public static void main(String[] args) {
        String string = "A Campaign for Real 15423 Cats.\n" +
                "\n" +
                "\tFar too many (people 12,55 these) days have grown used to boring, mass-produced 1452 cats ? " +
                "Which may bounce with 43,54 health and nourishing vitamins but aren't a patch on the good  old cats you used to get.";
        String result = UtilString.convertUppercaseFirstLetter(string);
        System.out.println(result);

        //
       // UtilString.countPunctuationMarks(string);

        //
       // UtilString.determineSumAllIntegers(string);

        //In each word of the text, replace the kth letter with the given character.
        // If k is greater than the word length, do not adjust

       // UtilString.replaceWithGivenCharacter(string,3,'W');

       // System.out.println(UtilString.deleteTextBetweenCharacters(string,'(', ')'));
       // UtilString.showHowManyWordRepeated(string);
       // UtilString.findWhichLettersMore(string);

        UtilString.findUniqueWordsInterrogativeSentences(string, 5);
    }
}
