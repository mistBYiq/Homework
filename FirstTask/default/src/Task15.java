public class Task15 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 1;
        while (i <= 100) {
            System.out.print(i++ + " ");
        }
        System.out.println();

        int j = 1;
        do {
            System.out.print(j++ + " ");
        } while (j <= 100);
    }
}
