// Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
//  1.for
//  2.while
//  3.do while

package defaults;

public class Task15 {

    public static void main(String[] args) {
        // 1
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2
        int i = 1;
        while (i <= 100) {
            System.out.print(i++ + " ");
        }
        System.out.println();

        //3
        int j = 1;
        do {
            System.out.print(j++ + " ");
        } while (j <= 100);
    }
}
