import java.util.Scanner;

class Util {

    public static final int MIN = -100;
    public static final int MAX = 100;

    public static void showArrayInt(int[] a) {
        for (int number : a) {
            System.out.print(number + "  ");
        }
        System.out.println();
    }

    public static void showMatrix(int[][] a) {
        for (int[] ints : a) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(ints[j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static <T> void showArrayT(T[] array) {
        for (T t : array) {
            System.out.print(t + "  ");
        }
        System.out.println();
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

    public static String[] createdArrayStrings() {

        System.out.println("Enter size array ");
        int n = enterNumericIntData();

        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = enterStringData();
        }

        return array;
    }

    public static int[] createdArrayInt() {

        System.out.println("Enter size array ");
        int n = enterNumericIntData();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random(MIN, MAX);
        }

        return array;
    }

    public static int generatedIntNum() {
        return random(MIN, MAX);
    }

    public static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
