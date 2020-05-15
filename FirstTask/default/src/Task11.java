public class Task11 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        // Можно с помощью метода класса Math
        // (Math.max(Math.max(a, b), c));

        if ((b < a) && (c < a)) {
            System.out.println("Max " + a);
        } else if ((a < b) && (c < b)) {
            System.out.println("Max " + b);
        } else if ((a < c) && (b < c)) {
            System.out.println("Max " + c);
        }
    }
}
