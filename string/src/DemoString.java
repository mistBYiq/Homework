import util.UtilString;

public class DemoString {
    public static void main(String[] args) {

        String file = UtilString.readFile("src\\resources\\cat.txt");

        String string = "A Campaign for Real 15423 Cats.\n" +
                "\n" +
                "\tFar too many ( people 12,55 these ) grown days have days too grown used to boring, mass-produced 1452 cats ? " +
                "Which may * bounce with 43,54 health and nourishing * vitamins but aren't a patch on the good  old cats you used to get.";

        // 1. Convert the text so that each word begins with a capital letter.
        System.out.println("  ========== part 1 ==========");
        UtilString.convertUppercaseFirstLetter(file);

        //2. Calculate the number of punctuation marks contained in this text
        System.out.println("  ========== part 2 ==========");
        UtilString.countPunctuationMarks(file);

        //3. Determine the sum of all integers found in the given text
        System.out.println("  ========== part 3 ==========");
        UtilString.determineSumAllIntegers(file);

        //4. In each word of the text, replace the kth letter with the given character.
        // If k is greater than the word length, do not perform the correction.
        System.out.println("  ========== part 4 ==========");
        UtilString.replaceWithGivenCharacter(file, 5, 'W');

        //5. To remove from the text its part enclosed between two characters
        // that are entered (for example, between the brackets ‘(’ and ‘)’ or between the asterisks ‘*’, etc.).
        System.out.println("  ========== part 5 ==========");
        UtilString.deleteTextBetweenCharacters(string, '(', ')');

        //6. Find and print how many times each word that appears in the text is repeated in the text.
        System.out.println("  ========== part 6 ==========");
        UtilString.showHowManyWordRepeated(file);

        //7. Find which letters, vowels or consonants, more in each sentence of the text
        System.out.println("  ========== part 7 ==========");
        UtilString.findWhichLettersMore(file);

        //8. In all interrogative sentences of the text to find
        // and print without repeating words of a given length
        System.out.println("  ========== part 8 ==========");
        UtilString.findUniqueWordsInterrogativeSentences(file, 5);
    }
}
