// Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
//  1.for
//  2.while
//  3.do while

package main.java.com.mistiq.homework.first_tasks.defaults;

public class Task15 {

    public static void main(String[] args) {

        showNumbersWithFor(Util.ONE, Util.ONE_HUNDRED);
        showNumbersWithWhile(Util.ONE, Util.ONE_HUNDRED);
        showNumbersWithDoWhile(Util.ONE, Util.ONE_HUNDRED);
    }

    public static void showNumbersWithFor(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void showNumbersWithWhile(int min, int max) {
        int i = min;
        while (i <= max) {
            System.out.print(i++ + " ");
        }
        System.out.println();
    }

    public static void showNumbersWithDoWhile(int min, int max) {
        int i = min;
        do {
            System.out.print(i++ + " ");
        } while (i <= max);
    }
}
