// Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class'
// getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats.
// Then print the formatted values as follows:
//  US: formattedPayment
//  ...
// where formattedPayment is payment formatted according to the appropriate Locale's currency.
// Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
// Input Format
//  A single double-precision number denoting payment.
// Constraints
//  0 <= payment <= 1_000_000_000

package main.java.com.mistiq.homework.first_tasks.advanced;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

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