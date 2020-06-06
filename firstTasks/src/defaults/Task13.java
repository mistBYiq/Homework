// Напишите программу, где двум строковым переменным присваиваются значения,
// третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
// Затем напечатайте значение третьей строковой переменной.

package defaults;

public class Task13 {

    public static void main(String[] args) {

        System.out.println("Enter first string  ");
        String str1 = Util.enterStringData();
        System.out.println("Enter second string  ");
        String str2 = Util.enterStringData();

        String str3 = concatenateLine(str1, str2);
        System.out.println(str3);
    }

    public static String concatenateLine(String str1, String str2) {
        return str1 + str2;
    }
}
