// Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления)

package defaults;

public class Task04 {

    public static final int MIN = 1;
    public static final int MAX = 100;

    public static void main(String[] args) {

        showEven(MIN,MAX);
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
