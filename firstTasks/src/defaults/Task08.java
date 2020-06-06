// Пройти циклом по числам от 1 до 12 и вывести название месяца,
// соответствующее каждому числу (используя цикл и оператор if else)

package defaults;

public class Task08 {

    public static void main(String[] args) {

        showMonths();
        showMonthsEnum();
    }

    // create an array of all enum values and print
    public static void showMonthsEnum() {
        Month[] months = Month.values();
        for (Month month : months) {
            System.out.println(month.toString());
        }
    }

    public static void showMonths() {
        for (int i = 1; i <= 12 ; i++) {
            if (i == 1) {
                System.out.println(i + " Январь");
            }
            if (i == 2) {
                System.out.println(i + " Февраль");
            }
            if (i == 3) {
                System.out.println(i + " Март");
            }
            if (i == 4) {
                System.out.println(i + " Апрель");
            }
            if (i == 5) {
                System.out.println(i + " Май");
            }
            if (i == 6) {
                System.out.println(i + " Июнь");
            }
            if (i == 7) {
                System.out.println(i + " Июль");
            }
            if (i == 8) {
                System.out.println(i + " Август");
            }
            if (i == 9) {
                System.out.println(i + " Сентябрь");
            }
            if (i == 10) {
                System.out.println(i + " Октябрь");
            }
            if (i == 11) {
                System.out.println(i + " Ноябрь");
            }
            if (i == 12) {
                System.out.println(i + " Декабрь");
            }
        }
    }
}