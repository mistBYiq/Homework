// Given a string A, print Yes if it is a palindrome, print No otherwise.
// Constraints
//  A will consist at most 50 lower case english letters.

package advanced;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        String temp = new StringBuilder(A).reverse().toString();
        if (A.equals(temp)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // в одну строчку System.out.println( A.equals( new StringBuilder(A).reverse().toString()) ? "Yes" : "No" );
    }
}
