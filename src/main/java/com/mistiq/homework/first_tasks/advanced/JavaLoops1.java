// Given an integer, N, print its first 10 multiples. Each multiple N * i (where 1 <= i <= 10)
// should be printed on a new line in the form: N x i = result.
// Input Format
//  A single integer, N.
// Constraints
//  2 <= N <= 20
// Output Format
// Print 10 lines of output; each line i (where 1 <= i <= 10) contains the result of N * i in the form:
//  N x i = result.

package main.java.com.mistiq.homework.first_tasks.advanced;

import java.util.Scanner;

public class JavaLoops1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
        scanner.close();
    }
}
