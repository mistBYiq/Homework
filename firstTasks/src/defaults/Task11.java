// Напишите программу с тремя переменными целого типа.
// Определить какое из них наибольшее

package defaults;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number  ");
        int a = scanner.nextInt();
        System.out.println("Enter second number  ");
        int b = scanner.nextInt();
        System.out.println("Enter third number  ");
        int c = scanner.nextInt();
        scanner.close();

        determineMaximum(a, b, c);
    }
    // or (Math.max(Math.max(a, b), c));
    public static void determineMaximum(int a, int b, int c) {
        if ((b < a) && (c < a)) {
            System.out.println("Max " + a);
        } else if ((a < b) && (c < b)) {
            System.out.println("Max " + b);
        } else if ((a < c) && (b < c)) {
            System.out.println("Max " + c);
        }
    }
}
