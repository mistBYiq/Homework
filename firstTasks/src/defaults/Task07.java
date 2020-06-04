// Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)

package defaults;

public class Task07 {

    public static final int MIN = 20;
    public static final int MAX = 200;

    public static void main(String[] args) {

        showSumNumbers(MIN, MAX);
    }

    public static void showSumNumbers(int min, int max) {
        int  sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
