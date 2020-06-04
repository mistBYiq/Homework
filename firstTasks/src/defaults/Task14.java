// Создайте программу с двумя переменными целого типа,
// присвойте им значения,
// если первая переменная больше второй, то увеличьте её значение на 3,
// иначе увеличьте значение второй переменной на 8.
// В конце программы выведите значения обоих чисел на экран.

package defaults;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number  ");
        int first = scanner.nextInt();
        System.out.println("Enter second number  ");
        int second = scanner.nextInt();
        scanner.close();

        determine(first, second);

    }

    public static void determine(int a, int b) {
        if(a > b) {
            a += Util.THREE;
        } else {
            b += Util.EIGHT;
        }

        System.out.println(a);
        System.out.println(b);
    }
}
