// Напишите метод, который будет увеличивать каждый элемент массива на 10%

package main.java.com.mistiq.homework.first_tasks.defaults;

public class Task02 {

    public static final Double COEFFICIENT = 1.1;

    public static void main(String[] args) {

        Double[] array = {1.0, 2.0, 3.0, 4.0, 5.0};

        increaseArrayElements(array);
        Util.showArray(array);
    }

    // method that will increase each element of the array by 10%
    public static void increaseArrayElements(Double[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i] *= COEFFICIENT;
        }
    }
}
