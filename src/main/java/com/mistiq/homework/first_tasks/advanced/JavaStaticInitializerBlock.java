// Static initialization blocks are executed when the class is loaded,
// and you can initialize static variables in those blocks.
// It's time to test your knowledge of Static initialization blocks. You can read about it here.
// You are given a class Solution with a main method.
// Complete the given code so that it outputs the area of a parallelogram with breadth B and height H.
// You should read the variables from the standard input.
// If B <= 0 or H <= 0, the output should be "java.lang.Exception:
// Breadth and height must be positive" without quotes.
// Input Format
//  There are two lines of input. The first line contains B: the breadth of the parallelogram.
//  The next line contains H: the height of the parallelogram.
// Constraints
//  -100 <= B <= 100
//  -100 <= H <= 100
// Output Format
//  If both values are greater than zero, then the main method must output the area of the parallelogram.
//  Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

package main.java.com.mistiq.homework.first_tasks.advanced;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
