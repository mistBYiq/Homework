// Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
// что сила тяжести равна 16% от силы тяжести на Земле.

package main.java.com.mistiq.homework.first_tasks.defaults;

class Task01 {

    public static final double MOON_GRAVITY = 0.16;

    public static void main(String[] args) {

        double weight = 75.5;
        double moonWeight = weight * MOON_GRAVITY;

        System.out.println("My weight on the moon is " + moonWeight + " kg");
    }
}