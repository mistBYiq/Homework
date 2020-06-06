// Напишите программу с тремя переменными целого типа.
// Определить какое из них наибольшее

package defaults;

public class Task11 {

    public static void main(String[] args) {

        System.out.println("Enter first number  ");
        int firstNum = Util.enterNumericIntData();
        System.out.println("Enter second number  ");
        int secondNum = Util.enterNumericIntData();
        System.out.println("Enter third number  ");
        int thirdNum = Util.enterNumericIntData();

        determineMaximum(firstNum, secondNum, thirdNum);
        determineMaximum2(firstNum, secondNum, thirdNum);
    }

    public static void determineMaximum(int a, int b, int c) {
        if ((b < a) && (c < a)) {
            System.out.println("Max " + a);
        } else if ((a < b) && (c < b)) {
            System.out.println("Max " + b);
        } else if ((a < c) && (b < c)) {
            System.out.println("Max " + c);
        }
    }

    public static void determineMaximum2(int a, int b, int c) {
        System.out.println("Max " + (Math.max(Math.max(a, b), c)));
    }
}
