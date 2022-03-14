// Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
// We define a token to be one or more consecutive English alphabetic letters.
// Then, print the number of tokens, followed by each token on a new line.
// Note: You may find the String.split method helpful in completing this challenge.
// Input Format
//  A single string, s.
// Constraints
//  1 <= lenght of s <= 4*10^5
//  s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!),
//  commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
// Output Format
//  On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique).
//  Next, print each of the n tokens on a new line in the same order as they appear in input string s.

package main.java.com.mistiq.homework.first_tasks.advanced;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        int t = s.trim().length(); // > 0 если содержит другие символы кроме пробела
        if (t == 0) {
            System.out.println(0);
        }
        if (t > 0) {
            String[] str = s.trim().split("[ _.,?!'@]+");
            System.out.println(str.length);
            for (String value : str) {
                System.out.println(value);
            }
        }

        scan.close();
    }
}

//      !string.trim().isEmpty();