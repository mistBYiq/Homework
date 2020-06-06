// Создайте программу с двумя переменными целого типа,
// присвойте им значения,
// если первая переменная больше второй, то увеличьте её значение на 3,
// иначе увеличьте значение второй переменной на 8.
// В конце программы выведите значения обоих чисел на экран.

package defaults;

public class Task14 {

    public static void main(String[] args) {

        System.out.println("Enter first number  ");
        int first = Util.enterNumericIntData();
        System.out.println("Enter second number  ");
        int second = Util.enterNumericIntData();

        determine(first, second);
    }

    public static void determine(int first, int second) {
        if(first > second) {
            first += Util.THREE;
        } else {
            second += Util.EIGHT;
        }
        System.out.println(first);
        System.out.println(second);
    }
}
