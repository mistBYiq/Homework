// Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)

package defaults;

public class Task04 {

    public static void main(String[] args) {

        showEven(Util.ONE, Util.ONE_HUNDRED);
    }

    // displays even numbers from the min max range
    public static void showEven(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % Util.TWO == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
