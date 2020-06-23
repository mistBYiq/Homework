import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {
        Locale locale = new Locale("ru", "RU");

        double lamboPrice = 180000.99;

        NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
        NumberFormat numberInstance1 = NumberFormat.getNumberInstance(Locale.getDefault());
        NumberFormat numberInstance2 = NumberFormat.getNumberInstance(Locale.GERMAN);

        NumberFormat germanCurrency = NumberFormat.getCurrencyInstance(Locale.GERMAN);
        NumberFormat englishCurrency = NumberFormat.getCurrencyInstance(Locale.ENGLISH);

        DateFormat englishDateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.ENGLISH);
        DateFormat germanDateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);

        System.out.println(numberInstance.format(lamboPrice));
        System.out.println(numberInstance1.format(lamboPrice));
        System.out.println(numberInstance2.format(lamboPrice));

        System.out.println();
        System.out.println(germanCurrency.format(lamboPrice));
        System.out.println(englishCurrency.format(lamboPrice));

        Date date = new Date();

        System.out.println(englishDateFormat.format(date));
        System.out.println(germanDateFormat.format(date));

        System.out.println(GreetingsReader.getInstance(Locale.FRANCE).getProperty(GreetingsReader.HELLO_WORD));
        System.out.println(GreetingsReader.getInstance(Locale.US).getProperty(GreetingsReader.HELLO_WORD));
        System.out.println(GreetingsReader.getInstance(Locale.getDefault()).getProperty(GreetingsReader.HELLO_WORD));

    }
}