// Все элементы массива поделить на значение наибольшего элемента этого массива.

package defaults;

public class Task17 {

    public static void main(String[] args) {

        double[] array = {1.0, 3.0, 15.4, 42.0, 17.5, 45.5, 18.6};

        double maxElement = findMaxElement(array);
        divideByValue(array, maxElement);
    }

    public static void divideByValue(double[] array, double maxElement) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] /= maxElement;
            System.out.print( array[i]+ "\t");
        }
    }

    public static double findMaxElement(double[] array) {
        int n = array.length;
        double max = array[0];
        for (int i = 1; i < n; i++) {
            if (max < array[i]) {
               max = array[i];
            }
        }
        return max;
    }
}
