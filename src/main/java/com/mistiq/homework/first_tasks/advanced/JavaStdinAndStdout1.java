// In this challenge, you must read 3 integers from stdin and then print them to stdout.
// Each integer must be printed on a new line. To make the problem a little easier,
// a portion of the code is provided for you in the editor below.
// Input Format
//  There are 3 lines of input, and each line contains a single integer.

package main.java.com.mistiq.homework.first_tasks.advanced;

import java.util.Scanner;

public class JavaStdinAndStdout1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
