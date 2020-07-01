
import domain.composite.Text;
import util.UtilComposite;

public class DemoComposite {

    public static void main(String[] args) {

        Text text = new Text("\t A ( Campaign for Real 15423 ) Cats.\n" +
                "\n" +
                "\tFar * too many people these days 152,1 have grown used to boring, mass-produced cats, which may bounce with health and nourishing vitamins but aren't a patch on the good old cats you used to get. The Campaign for Real Cats wants to change all hat by helping people recognise Real Cats when they see them. Hence this book.\n" +
                "\n" +
                "\tThe Campaign for Real Cats is against fizzy keg cats.\n" +
                "\n" +
                "\tAll right, How can I recognise a Real cat ?\n" +
                "\n" +
                "\tSimple. Nature has done ( a lot of the work for you ) . Many Real cats are instantly recognisable. For example, all cats with faces that look as though they had been put in a vice and hit repeatedly by a hammer with a sock round it are Real cats. Cats with ears that look as though they have been trimmed with pinking shears are Real cats. Almost every non-pedigree unneutered tom is not only Real, but as it hangs around the house it gets Realer and Realer until one of you is left in absolutely no doubt as to its Realness.\n" +
                "\n" +
                "\tFluffy cats are not necessarily unReal, but if they persist in putting on expressions of affronted dignity for the camera while advertising anything with the word “purr-fect” in the associated copy they are definitely bringing their Realness into question.\n" +
                "\n" +
                "\tAh. So cats in adverts aren't Real ?\n" +
                "\n" +
                "\tActually being in adverts 75245 doesn't make a cat unReal—it can't help it if someone plonks it down in some weird pyramid made of carpet and takes pictures of it peeping anxiously out of the hole—but its demeanour once there counts for a lot.\n" +
                "\n" +
                "\tFor * example, if you put an unReal cat down in front of a row of bowls of catfood it will obediently choose the one made by the sponsors of the ad even if all the others haven't got sump oil on them. A Real cat, on the other hand, will head for the most expensive regardless, pull it out onto the studio floor, eat it with great pleasure, try some of the others, trip up the cameraman and then get stuck behind the newsreaders' podium. Where it will be sick. And then, when its owners buy several large tins of the wretched stuff, it'll refuse to touch it again.\n" +
                "\n" +
                "\tReal cats never 2,4 wear bows (but sometimes they do wear bow-ties; see “Cartoon Cats”).");

//        Text text = new Text(UtilComposite.openFile("src\\resources\\cat.txt"));

    //   text.show();
        // 1. Convert the text so that each word begins with a capital letter.
        UtilComposite.changeFirstLiteral(text);

        //2. Calculate the number of punctuation marks contained in this text
        UtilComposite.showPunctuationMarks(text);

        //3. Determine the sum of all integers found in the given text
        UtilComposite.showSumInteger(text);

        //4. In each word of the text, replace the kth letter with the given character.
        // If k is greater than the word length, do not perform the correction.
        UtilComposite.replaceWithGivenCharacter(text, 3,'W');

        //5. To remove from the text its part enclosed between two characters
        // that are entered (for example, between the brackets ‘(’ and ‘)’ or between the asterisks ‘*’, etc.).
        UtilComposite.deleteTextBetweenCharacters(text,"(",")");

        //6. Find and print how many times each word that appears in the text is repeated in the text.
        System.out.println("  ========== part 6 ==========");
        UtilComposite.showHowManyWordRepeated(text);

        //7. Find which letters, vowels or consonants, more in each sentence of the text
        System.out.println("  ========== part 7 ==========");
        UtilComposite.findWhichLettersMore(text);

        //8. In all interrogative sentences of the text to find
        // and print without repeating words of a given length
        System.out.println("  ========== part 8 ==========");
        UtilComposite.findUniqueWordsInterrogativeSentences(text,5);
    }
}
