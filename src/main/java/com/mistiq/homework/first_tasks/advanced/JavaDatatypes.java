// Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double.
// For this exercise, we'll work with the primitives used
// to hold integer values (byte, short, int, and long):
//  A byte is an 8-bit signed integer.
//  A short is a 16-bit signed integer.
//  An int is a 32-bit signed integer.
//  A long is a 64-bit signed integer.
// Given an input integer, you must determine which primitive data types are capable of properly
// storing that input.
// To get you started, a portion of the solution is provided for you in the editor.

package main.java.com.mistiq.homework.first_tasks.advanced;

import java.util.Scanner;

public class JavaDatatypes {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                if (x >= -32768 && x <= 32767) System.out.println("* short");
                if ((x >= (int) Math.pow(-2, 31) && x <= (int) (Math.pow(2, 31) - 1))
                        || (x >= 0 && x <= (int) (Math.pow(2, 32) - 1))) System.out.println("* int");
                if ((x >= (long) Math.pow(-2, 63) && x <= (long) (Math.pow(2, 63) - 1))
                        || (x >= 0 && x <= (long) (Math.pow(2, 64) - 1))) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
