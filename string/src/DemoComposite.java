import domain.compositeTwo.Composite;
import util.UtilCompositeTwo;

public class DemoComposite {
    public static void main(String[] args) {
        String stringText = "\tA Campaign for Real 15423 Cats.\n" ;

        Composite textComposite = UtilCompositeTwo.splitParagraph(stringText);

        textComposite.read();
    }
}
