// Вывести на  экран все четные цифры от 1 до 100
// не используя остаток от деления (используя только цикл for)

package defaults;

public class Task06 {

    public static void main(String[] args) {

        showEvenNum(Util.TWO, Util.ONE_HUNDRED);
    }

    public static void showEvenNum(int min, int max) {
        for (int i = min; i <= max; i += Util.TWO) {
            System.out.print(i + " ");
        }
    }

}
