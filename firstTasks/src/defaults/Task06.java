// Вывести на  экран все четные цифры от 1 до 100
// не используя остаток от деления (используя только цикл for)

package defaults;

public class Task06 {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
