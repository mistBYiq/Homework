// Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
// Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
// Минимум, максимум и шаг указываются пользователем (можно захардкодить).

package defaults;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("min ");
        int a = scanner.nextInt();
        System.out.println("max ");
        int b = scanner.nextInt();
        System.out.println("step ");
        int c = scanner.nextInt();
        showNum(a, b, c);
    }

    public static void showNum(int min, int max, int step) {
        for (int i = min; i <= max; i += step) {
            System.out.print(i + " ");
        }
    }
}
