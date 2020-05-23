// Напишите метод, который будет увеличивать каждый элемент массива на 10%

public class Task02 {

    public static void main(String[] args) {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};
        increaseArrayElements(array);
        for (double v : array) {
            System.out.println(v);
        }
    }

    public static void increaseArrayElements(double[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] *= 1.1;
        }
    }
}
