import java.util.Locale;
import java.util.ResourceBundle;

public class GreetingsReader {
    public static GreetingsReader instance;
    private ResourceBundle resourceBundle;

    private static final String BUNDLE_NAME = "greetings";
    public static final String HELLO_WORD = "helloword";

    public static GreetingsReader getInstance(Locale locale) {

        instance = new GreetingsReader();
        //Read page.properties file from resources package and save info from file to resourceBundle variable
        instance.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);

        return instance;
    }

    public String getProperty(String key) {
        return (String) resourceBundle.getObject(key);
    }
}