// Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for)

package main.java.com.mistiq.homework.first_tasks.defaults;

public class Task07 {


    public static void main(String[] args) {

        showSumNumbers(Util.TWENTY, Util.TWO_HUNDRED);
    }

    public static void showSumNumbers(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
