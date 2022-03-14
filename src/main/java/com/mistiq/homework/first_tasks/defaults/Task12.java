// Напишите программу, в которой используются две переменные логического типа (boolean),
// присвойте им значения и выведете для каждой переменной на экран строку
// "истина", если переменная имеет значение true и
// "ложь", если переменная имеет значение false

package main.java.com.mistiq.homework.first_tasks.defaults;

public class Task12 {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        isTrueOrFalse(a);
        isTrueOrFalse(b);
    }

    public static void isTrueOrFalse(boolean bool) {
        if (bool) {
            System.out.println(" истина");
        } else {
            System.out.println(" ложь");
        }
    }
}
