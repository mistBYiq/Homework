// Объявить 2 переменных целого типа.
// Необходимо поменять значения переменных так,
// чтобы значение первой оказалось во второй, а второй - в первой.

package defaults;

public class Task09 {

    public static void main(String[] args) {

        int a = Util.enterNumericIntData();
        int b = Util.enterNumericIntData();

        swapValues1(a, b);
        swapValues2(a, b);
    }

    public static void swapValues1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a = " + a + " \t" + " b = " + b);
    }

    public static void swapValues2(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        System.out.println(" a = " + a + " \t" + " b = " + b);
    }
}