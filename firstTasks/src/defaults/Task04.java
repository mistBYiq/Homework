// Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)

package defaults;

public class Task04 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
