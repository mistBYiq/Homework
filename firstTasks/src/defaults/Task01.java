// Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
// что сила тяжести равна 16% от силы тяжести на Земле.

package defaults;

class Task01 {

    public static void main(String[] args) {
        double m = 75.5;
        System.out.println("My weight on the moon is " + m * 0.16 + " kg");
    }
}