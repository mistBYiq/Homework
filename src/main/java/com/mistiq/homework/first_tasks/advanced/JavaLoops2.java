// We use the integers a, b, and n to create the following series:
//      (a + 2^0 * b),(a + 2^0 * b + 2^1 * b),...,(a + 2^0 * b + 2^1 * b + ... + 2^(n-1) * b)
// You are given  queries in the form of a, b, and n. For each query,
// print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
// Input Format
//  The first line contains an integer, q, denoting the number of queries.
//  Each line i of the q subsequent lines contains three space-separated integers describing
//  the respective ai, bi, and ni values for that query.
// Constraints
//  0 <= q <= 500
//  0 <= a,b <= 50
//  1 <= n <= 15
// Output Format
//  For each query, print the corresponding series on a new line. Each series must be printe
//  in order as a single line of n space-separated integers.

package main.java.com.mistiq.homework.first_tasks.advanced;

import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a + b;
            int temp = 2;
            for (int j = 1; j <= n; j++) {
                System.out.print(result + " ");
                result = result + b * (int) Math.pow(temp, j);
            }
            System.out.println();
        }
        in.close();
    }
}
