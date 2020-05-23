// Напишите метод, который будет проверять является ли число палиндромом
// (одинаково читающееся в обоих направлениях)

public class Task03 {

    public static void main(String[] args) {
        String num1 = "12321";
        String num2 = "12345";
        System.out.println(num1 + "  Is this number a palindrome? " + isPalindrome1(num1) + " " + isPalindrome2(num1));
        System.out.println(num2 + "  Is this number a palindrome? " + isPalindrome1(num2) + " " + isPalindrome2(num2));
    }

    public static boolean isPalindrome1(String num) {
        char[] ch = num.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i++, n--) {
            if(ch[i] != ch[n - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String num) {
        int n = num.length();
        StringBuilder reversNum = new StringBuilder();
        for (int x = n - 1; x >= 0; x--) {
            reversNum.append(num.charAt(x));
        }
        return num.equals(reversNum.toString());
    }
}