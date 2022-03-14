// Напишите метод переводящий рубли в доллары по заданному курсу.
// В качестве аргументов укажите кол-во рублей и курс.

package main.java.com.mistiq.homework.first_tasks.defaults;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task18 {

    public static final String COURSE = "2.4462";

    public static void main(String[] args) {

        System.out.println("Enter the number of rubles  ");
        String rubles = Util.enterStringData();

        convert(rubles, COURSE);
    }

    //  for money operations we use the java.math.BigDecimal class
    public static void convert(String rubles, String course) {
        BigDecimal ruble = new BigDecimal(rubles);
        BigDecimal exchangeRates = new BigDecimal(course);

        // so that there is no ArithmeticException and for convenience we round to cents (2 decimal places)
        BigDecimal value = ruble.divide(exchangeRates, 2, RoundingMode.HALF_DOWN);
        System.out.println(value);
    }
}