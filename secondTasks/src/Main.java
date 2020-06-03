/* public class NewMain {
    public static void main(String[] args) {
        task1();
        task2();
    }
/Тут условие/
private static void task2() {}
/Тут условие/
private static void task1() {}
*/

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array_int = {7, 13, 42, 2, -3, 2, -11, 2, 27, 15, 15, -42,};
        int[] array_int2 = {8, 4, 2, 7, -2, 58};
        String[] arrayStrings = {"DD", "WW", "KK", "EE", "AA", "aa", "dd", "ww", "WW", "kk", "ee"};
        String[] arrayStrings2 = {"MM", "JJ", "KK", "OO", "AA", "se", "id", "cr", "HH", "kp", "ele" };
        task01(array_int, arrayStrings);
        task02(array_int);
        // task03;
        task04(array_int);
        task05(array_int, 9);

        task06(array_int,15);
        task07(array_int, 42);
        task08(array_int);
        task09(array_int,123, 5);
        task10(array_int);

        task11(array_int);
        task12(array_int);
        task13(arrayStrings);
        task14(arrayStrings,arrayStrings2);
        task15(array_int, array_int2);

        task16(array_int);
        task17(array_int);
        task18(array_int);
        task19();
        task20(arrayStrings);
    }

    // Write a Java program to sort a numeric array and a string array.
    private static void task01(int[] a, String[] s) {
        System.out.println("========== Task 1 ==========");
        int n = a.length;
        int[] b = new int[n];
        System.arraycopy(a, 0, b, 0, n);
        for (int i = 0; i < n; i++) {
            int temp = b[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < b[j]) {
                    b[j + 1] = b[j];
                } else {
                    break;
                }
            }
            b[j + 1] = temp;
        }
        Outputs.showArrNum(b);

        String temp = "";
        boolean needSorted = true;
        while (needSorted) {
            needSorted = false;
            for (int i = 1; i < s.length; i++) {
                if (s[i-1].compareTo(s[i]) < 0) {
                    temp = s[i];
                    s[i] = s[i - 1];
                    s[i -1] = temp;
                    needSorted = true;
                }
            }
        }
        Outputs.showArrStr(s);
    }

    // Write a Java program to sum values of an array.
    private static void task02(int[] a) {
        System.out.println("========== Task 2 ==========");
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("The sum of the elements of the array is  " + sum);
    }

    // Write a Java program to print the following grid
    private static void task03() {
        System.out.println("========== Task 3 ==========");

    }

    // Write a Java program to calculate the average value of array elements.
    private static void task04(int[] a) {
        System.out.println("========== Task 4 ==========");
        int n = a.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println("The average value of the array elements is  " + (sum / n));
    }

    // Write a Java program to test if an array contains a specific value.
    private static void task05(int[] a, int value) {
        System.out.println("========== Task 5 ==========");
        int n = a.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == value) {
                counter++;
                break;
            }
        }
        System.out.println( counter > 0 ? "contains this element": "does not contain this element");
    }

    // Write a Java program to find the index of an array element.
    private static void task06(int[] a, int value) {
        System.out.println("========== Task 6 ==========");
        int n = a.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == value) {
                System.out.print("index  " + i + "\n");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Not found this value");
        }
    }

    // Write a Java program to remove a specific element from an array.
    private static void task07(int[] a, int value) {
        System.out.println("========== Task 7 ==========");
        int n = a.length;
        int counter = 0;
        for (int item : a) {
            if (item == value) {
                counter++;
            }
        }

        int lengthNewArray = n - counter;
        int[] b = new int[lengthNewArray];
        for (int i = 0, j = 0; i < n; i++) {
            if (a[i] != value) {
                b[j] = a[i];
                j++;
            }
        }
        Outputs.showArrNum(b);
    }

    // Write a Java program to copy an array by iterating the array.
    private static void task08(int[] a) {
        System.out.println("========== Task 8 ==========");
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        System.out.println("Copy array ");
        Outputs.showArrNum(b);
    }

    // Write a Java program to insert an element (specific position) into an array.
    private static void task09(int[] a, int value, int index) {
        System.out.println("========== Task 9 ==========");
        int n = a.length;
        int lengthNewArray = n + 1;
        int[] b = new int[lengthNewArray];
        for (int i = 0, j = 0; j < n; i++, j++) {
            if (i < index) {
                b[i] = a[j];
            }
            if (i == index){
                b[i] = value;
                j--;
            }
            if (i > index) {
                b[i] = a[j];
            }
        }
        Outputs.showArrNum(b);
    }

    // Write a Java program to find the maximum and minimum value of an array.
    private static void task10(int[] a) {
        System.out.println("========== Task 10 ==========");
        int n = a.length;
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (min >= a[i]) {
                min = a[i];
            }
            if (max <= a[i]) {
                max = a[i];
            }
        }
        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);

    }

    // Write a Java program to reverse an array of integer values.
    private static void task11(int[] array) {
        System.out.println("========== Task 11 ==========");
        int n = array.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = array[i];
        }
        Outputs.showArrNum(a);

        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        System.out.println("Reverse array");
        Outputs.showArrNum(a);
    }

    // Write a Java program to find the duplicate values of an array of integer values.
    private static void task12(int[] a) {
        System.out.println("========== Task 12 ==========");
        int n = a.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No duplicate values");
        }
    }

    // Write a Java program to find the duplicate values of an array of string values.
    private static void task13(String[] s) {
        System.out.println("========== Task 13 ==========");
        int n = s.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].equals(s[j])) {
                    System.out.println(s[i]);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No duplicate values");
        }
    }

    // Write a Java program to find the common elements between two arrays (string values).
    private static void task14(String[] s1, String[] s2) {
        System.out.println("========== Task 14 ==========");
        int n1 = s1.length;
        int n2 = s2.length;
        int counter = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (s1[i].equals(s2[j])) {
                    System.out.println(s1[i]);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No common elements");
        }
    }

    // Write a Java program to find the common elements between two arrays of integers.
    private static void task15(int[] a, int[] b) {
        System.out.println("========== Task 15 ==========");
        int n1 = a.length;
        int n2 = b.length;
        int counter = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No common elements");
        }
    }

    // Write a Java program to remove duplicate elements from an array.
    private static void task16(int[] a) {
        System.out.println("========== Task 16 ==========");
        Outputs.showArrNum(a);
        int n = a.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    counter++;
                }
            }
        }
        int l = n - counter + 1;
        int[] b = new int[l];
        for (int i = 0, k = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count == 0) {
                b[k] = a[i];
                k++;
            }
        }
        Outputs.showArrNum(b);
    }

    // Write a Java program to find the second largest element in an array.
    private static void task17(int[] a) {
        System.out.println("========== Task 17 ==========");
        Outputs.showArrNum(a);
        int n = a.length;
        int max = a[0];
        int second = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                second = max;
                max = a[i];
            } else {
                if (a[i] > second) {
                    second = a[i];
                }
            }
        }
        System.out.println("second max = " + second);

    }

    // Write a Java program to find the second smallest element in an array
    private static void task18(int[] a) {
        System.out.println("========== Task 18 ==========");
        Outputs.showArrNum(a);
        int n = a.length;
        int min = a[0];
        int second = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                second = min;
                min = a[i];
            } else {
                if (a[i] < second){
                    second = a[i];
                }
            }
        }
        System.out.println("second min  = " + second);
    }

    // Write a Java program to add two matrices of the same size.
    private static void task19() {
        System.out.println("========== Task 19 ==========");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size");
        int n = scanner.nextInt();

        int[][] matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = i + j;
            }
        }

        int[][] matrixB = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixB[i][j] = i + j + 1;
            }
        }

        int[][] result = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        Outputs.showMatrix(result);
    }

    // Write a Java program to convert an array to ArrayList.
    private static void task20(String[] s) {
        System.out.println("========== Task 20 ==========");
        ArrayList<String> list = new ArrayList<>();
        int n = s.length;
        for (int i = 0; i < n; i++) {
            list.add(s[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}