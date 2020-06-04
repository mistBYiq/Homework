// Напишите программу, где двум строковым переменным присваиваются значения,
// третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
// Затем напечатайте значение третьей строковой переменной.

package defaults;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string  ");
        String a = scanner.nextLine();
        System.out.println("Enter second string  ");
        String b = scanner.nextLine();
        scanner.close();

        String c = concatenateLine(a, b);
        System.out.println(c);
    }

    public static String concatenateLine(String a, String b) {
        return a + b;
    }
}
