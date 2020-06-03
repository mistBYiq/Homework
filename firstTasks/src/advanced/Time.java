// Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток

package advanced;

import java.util.Scanner;

public class Time {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input N days ");
        int days = sc.nextInt();
        show(days);
    }

    public static void show(int days) {
        long hours = days * 24;
        long minutes = days * 1440;
        long sec = days * 86400;
        System.out.println("In  " + days + "  days :");
        System.out.println(hours + "  hours");
        System.out.println(minutes + "  minutes");
        System.out.println(sec + "  seconds");
    }
}
