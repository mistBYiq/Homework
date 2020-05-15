import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("min ");
        int a = scanner.nextInt();
        System.out.println("max ");
        int b = scanner.nextInt();
        System.out.println("step ");
        int c = scanner.nextInt();
        showNum(a, b, c);
    }

    public static void showNum(int min, int max, int step) {
        for (int i = min; i < max; i += step) {
            System.out.print(i + " ");
        }
    }
}
