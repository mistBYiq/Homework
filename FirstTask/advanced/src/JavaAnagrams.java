// Print "Anagrams" if a and b are case-insensitive anagrams of each other;
// otherwise, print "Not Anagrams" instead.
// Constraints
//  1 <= length(a),length(b) <= 50
//  Strings a and b consist of English alphabetic characters.
//  The comparison should NOT be case sensitive.

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        int n = 0;
        while (n < a.length()) {
            int counterA = 0;
            int counterB = 0;

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(n) == a.charAt(i)) {
                    counterA++;
                }
            }

            for (int i = 0; i < b.length(); i++) {
                if (a.charAt(n) == b.charAt(i)) {
                    counterB++;
                }
            }

            if (counterA != counterB) {
                return false;
            }
            ++n;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
