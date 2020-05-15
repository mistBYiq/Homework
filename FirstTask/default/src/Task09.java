public class Task09 {

    public static void main(String[] args) {
        int a = 7;
        int b = 1;

        // первый способ
        a = a + b;
        b = a - b;
        a = a - b;

        // второй способ
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;

    }
}
