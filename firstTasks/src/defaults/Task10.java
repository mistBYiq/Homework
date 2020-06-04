// Напишите программу с тремя переменными целого типа, первым двум присвойте значения,
// а третьей переменной присвойте их сумму.
// Выведете значение третей переменной на экран.

package defaults;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number  ");
        int a = scanner.nextInt();
        System.out.println("Enter second number  ");
        int b = scanner.nextInt();
        scanner.close();

        int s = summarize(a, b);
        System.out.println(s);
    }

    public static int summarize(int a, int b) {
        return (a + b);
    }
}
