// Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления)

package defaults;

public class Task05 {

    public static final int MIN = 1;
    public static final int MAX = 15;

    public static void main(String[] args) {

        showOdd(MIN, MAX);
    }

    // displays odd numbers from the min max range
    public static void showOdd(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % Util.TWO != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
