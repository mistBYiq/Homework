// The challenge here is to read n lines of input until you reach EOF,
// then number and print all n lines of content.
// Hint: Java's Scanner.hasNext() method is helpful for this problem.
// Input Format
//  Read some unknown  lines of input from stdin(System.in) until you reach EOF;
//  each line of input contains a non-empty String.
// Output Format
//  For each line, print the line number, followed by a single space,
//  and then the line content received as input.

package main.java.com.mistiq.homework.first_tasks.advanced;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";
        int i = 0;
        while (scanner.hasNext()) {
            string = scanner.nextLine();
            System.out.println(++i + " " + string);
        }
        scanner.close();
    }
}