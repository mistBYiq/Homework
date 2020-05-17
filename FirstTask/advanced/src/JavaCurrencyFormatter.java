import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat currencyFormatterUs = NumberFormat.getCurrencyInstance(Locale.US);
        String us = currencyFormatterUs.format(payment);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat currencyFormatterIndia = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = currencyFormatterIndia.format(payment);

        NumberFormat currencyFormatterChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = currencyFormatterChina.format(payment);

        NumberFormat currencyFormatterFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = currencyFormatterFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}