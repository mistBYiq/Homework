public class Task17 {

    public static void main(String[] args) {
        double[] array = {1.0, 3.0, 15.4, 42.0, 17.5, 45.5, 18.6};
        double max = maxElement(array);

        for (int i = 0; i < array.length; i++) {
            array[i] /= max;
        }
    }

    public static double maxElement(double[] a) {
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
