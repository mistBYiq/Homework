public class Task03 {

    public static void main(String[] args) {

    }

    public static boolean IsPalindrome1(String num) {
        char[] ch = num.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; i++, n--) {
            if(ch[i] != ch[n - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean IsPalindrome2(String num) {
        int n = num.length();
        StringBuilder reversNum = new StringBuilder();
        for (int x = n - 1; x >= 0; x--) {
            reversNum.append(num.charAt(x));
        }
        return num.equals(reversNum.toString());
    }
}