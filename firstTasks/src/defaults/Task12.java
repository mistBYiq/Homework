// Напишите программу, в которой используются две переменные логического типа (boolean),
// присвойте им значения и выведете для каждой переменной на экран строку
// "истина", если переменная имеет значение true и
// "ложь", если переменная имеет значение false

package defaults;

public class Task12 {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        isTrueOrFalse(a);
        isTrueOrFalse(b);
    }

    public static void isTrueOrFalse(boolean a) {
        if(a) {
            System.out.println("a истина");
        } else {
            System.out.println("a ложь");
        }
    }
}
