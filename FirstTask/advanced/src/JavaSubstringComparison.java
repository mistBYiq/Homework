// Given a string, s, and an integer, k, complete the function so that it
// finds the lexicographically smallest and largest substrings of length k.
// Input Format
//  The first line contains a string denoting s.
//  The second line contains an integer denoting k.
// Constraints
//  1 <= |s| <= 1000
//  s consists of English alphabetic letters only (i.e., [a-zA-Z]).
// Output Format
//  Return the respective lexicographically smallest and largest substrings as a single newline-separated string.

import java.util.Scanner;

public class JavaSubstringComparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String temp = s.substring(i, i + k);
            if (smallest.compareTo(temp) > 0)
                smallest = temp;
            if (largest.compareTo(temp) < 0)
                largest = temp;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
