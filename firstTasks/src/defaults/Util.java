package defaults;

import java.util.Scanner;

public class Util {

    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int EIGHT = 8;
    public static final int FIFTEEN = 15;
    public static final int TWENTY = 20;
    public static final int ONE_HUNDRED = 100;
    public static final int TWO_HUNDRED = 200;
    public static final String STRING_ONE = "12321";
    public static final String STRING_TWO = "TENET";

    public static <T> void showArray(T[] array) {
        for (T t : array) {
            System.out.print(t + "  ");
        }
    }

    public static int enterNumericIntData() {
        Scanner scanner = new Scanner(System.in);
        int numInt = scanner.nextInt();
        scanner.close();
        return numInt;
    }

    public static String enterStringData() {
        Scanner scanner = new Scanner(System.in);
        String strings = scanner.nextLine();
        scanner.close();
        return strings;
    }

}