// Напишите метод, который будет проверять является ли число палиндромом
// (одинаково читающееся в обоих направлениях)

package defaults;

public class Task03 {

    public static void main(String[] args) {

        System.out.println(Util.STRING_ONE + "  Is this number a palindrome? "
                            + isPalindrome1(Util.STRING_ONE) + " " + isPalindrome2(Util.STRING_ONE));
        System.out.println(Util.STRING_TWO + "  Is this number a palindrome? "
                            + isPalindrome1(Util.STRING_TWO) + " " + isPalindrome2(Util.STRING_TWO));
    }

    // compare the characters of the string first with last, second with penultimate, etc.
    public static boolean isPalindrome1(String string) {
        char[] ch = string.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i++, n--) {
            if(ch[i] != ch[n - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String string) {
        int n = string.length();
        StringBuilder reversNum = new StringBuilder();
        for (int x = n - 1; x >= 0; x--) {
            reversNum.append(string.charAt(x));
        }
        return string.equals(reversNum.toString());
    }
}