// Напишите программу с тремя переменными целого типа, первым двум присвойте значения,
// а третьей переменной присвойте их сумму.
// Выведете значение третей переменной на экран.

package main.java.com.mistiq.homework.first_tasks.defaults;

public class Task10 {

    public static void main(String[] args) {

        System.out.println("Enter first number  ");
        int a = Util.enterNumericIntData();
        System.out.println("Enter second number  ");
        int b = Util.enterNumericIntData();

        int s = summarize(a, b);
        System.out.println(s);
    }

    public static int summarize(int a, int b) {
        return (a + b);
    }
}
