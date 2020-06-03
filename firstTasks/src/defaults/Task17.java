// Все элементы массива поделить на значение наибольшего элемента этого массива.

package defaults;

public class Task17 {

    public static void main(String[] args) {

        double[] array = {1.0, 3.0, 15.4, 42.0, 17.5, 45.5, 18.6};
        double maxElement = findMaxElement(array);
        divideByValue(array, maxElement);
    }

    public static void divideByValue(double[] array, double maxElement) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((array[i] /= maxElement) + "\t");
        }
    }

    public static double findMaxElement(double[] a) {
        int n = a.length;
        double max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
               max = a[i];
            }
        }
        return max;
    }
}
