public class Outputs {
    public static void showArrNum(int[] a) {
        for (int number : a) {
            System.out.print(number + "  ");
        }
        System.out.println();
    }

    public static void showArrStr(String[] s) {
        for (String strings: s) {
            System.out.print(strings + "  ");
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
}
