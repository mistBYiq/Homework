// Task
// Given an integer, n, perform the following conditional actions:
//  If n is odd, print Weird
//  If n is even and in the inclusive range of 2 to 5, print Not Weird
//  If n is even and in the inclusive range of 6 to 20, print Weird
//  If n is even and greater than 20, print Not Weird
// Complete the stub code provided in your editor to print whether or not n is weird.
// Input Format
//  A single line containing a positive integer, .
// Constraints
//  1 <= n <= 100
// Output Format
//  Print Weird if the number is weird; otherwise, print Not Weird.

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else {
            if((N >= 2) && (N <= 5)) {
                System.out.println("Not Weird");
            }
            if((N >= 6) && (N <= 20)) {
                System.out.println("Weird");
            }
            if(N > 20) {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}
