package main.java.com.mistiq.homework.second_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task {

    // Write a Java program to sort a numeric array and a string array.
    protected static void task01(int[] arrayInt, String[] arrayStrings) {
        System.out.println("========== Task 1 ==========");

        int[] tempArray = Arrays.copyOf(arrayInt, arrayInt.length);
        int n = tempArray.length;
        for (int i = 0; i < n; i++) {
            int temp = tempArray[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (temp < tempArray[j]) {
                    tempArray[j + 1] = tempArray[j];
                } else {
                    break;
                }
            }
            tempArray[j + 1] = temp;
        }
        Util.showArrayInt(tempArray);

        String[] tempStrings = Arrays.copyOf(arrayStrings, arrayStrings.length);
        // sort array string
        Arrays.sort(tempStrings);

        Util.showArrayT(tempStrings);
    }

    // Write a Java program to sum values of an array.
    protected static void task02(int[] arrayInt) {
        System.out.println("========== Task 2 ==========");

        int sum = 0;
        for (int value : arrayInt) {
            sum += value;
        }
        System.out.println("The sum of the elements of the array is  " + sum);
    }

    // Write a Java program to calculate the average value of array elements.
    protected static void task04(int[] arrayInt) {
        System.out.println("========== Task 4 ==========");

        int n = arrayInt.length;
        int sum = 0;
        for (int value : arrayInt) {
            sum += value;
        }
        System.out.println("The average value of the array elements is  " + (sum / n));
    }

    // Write a Java program to test if an array contains a specific value.
    protected static void task05(int[] arrayInt) {
        System.out.println("========== Task 5 ==========");

        System.out.println("Enter specific value ");
        int value = Util.enterNumericIntData();
        int counter = 0;

        for (int item : arrayInt) {
            if (item == value) {
                counter++;
                break;
            }
        }
        System.out.println(counter > 0 ? "contains this element" : "does not contain this element");
    }

    // Write a Java program to find the index of an array element.
    protected static void task06(int[] arrayInt) {
        System.out.println("========== Task 6 ==========");

        System.out.println("Enter the index to search ");
        int index = Util.enterNumericIntData();
        int n = arrayInt.length;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (arrayInt[i] == index) {
                System.out.print("index  " + i + "\n");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Not found this value");
        }
    }

    // Write a Java program to remove a specific element from an array.
    protected static void task07(int[] arrayInt) {
        System.out.println("========== Task 7 ==========");

        System.out.println("Enter value");
        int value = Util.enterNumericIntData();
        int n = arrayInt.length;
        int counter = 0;
        for (int item : arrayInt) {
            if (item == value) {
                counter++;
            }
        }

        int lengthNewArray = n - counter;
        int[] arrayResult = new int[lengthNewArray];
        for (int i = 0, j = 0; i < n; i++) {
            if (arrayInt[i] != value) {
                arrayResult[j] = arrayInt[i];
                j++;
            }
        }
        Util.showArrayInt(arrayResult);
    }

    // Write a Java program to copy an array by iterating the array.
    protected static void task08(int[] arrayInt) {
        System.out.println("========== Task 8 ==========");
        int n = arrayInt.length;
        int[] arrayResult = new int[n];
        System.arraycopy(arrayInt, 0, arrayResult, 0, n);
        System.out.println("Copy array ");
        Util.showArrayInt(arrayResult);
    }

    // Write a Java program to insert an element (specific position) into an array.
    protected static void task09(int[] arrayInt) {
        System.out.println("========== Task 9 ==========");

        int n = arrayInt.length;
        System.out.println("Enter value  ");
        int value = Util.enterNumericIntData();
        System.out.println("Size original array = " + n + "Enter specific position for VALUE(from 0 to " + n);
        int index = Util.enterNumericIntData();
        int lengthNewArray = n + 1;
        int[] arrayResult = new int[lengthNewArray];

        for (int i = 0, j = 0; j < n; i++, j++) {
            if (i < index) {
                arrayResult[i] = arrayInt[j];
            }
            if (i == index) {
                arrayResult[i] = value;
                j--;
            }
            if (i > index) {
                arrayResult[i] = arrayInt[j];
            }
        }
        Util.showArrayInt(arrayResult);
    }

    // Write a Java program to find the maximum and minimum value of an array.
    protected static void task10(int[] arrayInt) {
        System.out.println("========== Task 10 ==========");

        int n = arrayInt.length;
        int min = arrayInt[0];
        int max = arrayInt[0];

        for (int i = 1; i < n; i++) {
            if (min >= arrayInt[i]) {
                min = arrayInt[i];
            }
            if (max <= arrayInt[i]) {
                max = arrayInt[i];
            }
        }
        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);

    }

    // Write a Java program to reverse an array of integer values.
    protected static void task11(int[] array) {
        System.out.println("========== Task 11 ==========");

        int n = array.length;
        int[] arrayResult = new int[n];
        System.arraycopy(array, 0, arrayResult, 0, n);
        Util.showArrayInt(arrayResult);

        for (int i = 0; i < n / 2; i++) {
            int temp = arrayResult[i];
            arrayResult[i] = arrayResult[n - i - 1];
            arrayResult[n - i - 1] = temp;
        }
        System.out.println("Reverse array");
        Util.showArrayInt(arrayResult);
    }

    // Write a Java program to find the duplicate values of an array of integer values.
    protected static void task12(int[] arrayInt) {
        System.out.println("========== Task 12 ==========");

        int n = arrayInt.length;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrayInt[i] == arrayInt[j]) {
                    System.out.println(arrayInt[i]);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No duplicate values");
        }
    }

    // Write a Java program to find the duplicate values of an array of string values.
    protected static void task13(String[] s) {
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
    protected static void task14(String[] arrayStrOne, String[] arrayStrTwo) {
        System.out.println("========== Task 14 ==========");

        int counter = 0;
        for (String s : arrayStrOne) {
            for (String value : arrayStrTwo) {
                if (s.equals(value)) {
                    System.out.println(s);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No common elements");
        }
    }

    // Write a Java program to find the common elements between two arrays of integers.
    protected static void task15(int[] arrayIntOne, int[] arrayIntTwo) {
        System.out.println("========== Task 15 ==========");

        int counter = 0;
        for (int value : arrayIntOne) {
            for (int i : arrayIntTwo) {
                if (value == i) {
                    System.out.println(value);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("No common elements");
        }
    }

    // Write a Java program to remove duplicate elements from an array.
    protected static void task16(int[] arrayInt) {
        System.out.println("========== Task 16 ==========");

        Util.showArrayInt(arrayInt);
        int n = arrayInt.length;
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arrayInt[i] == arrayInt[j]) {
                    counter++;
                }
            }
        }

        int l = n - counter + 1;
        int[] b = new int[l];
        for (int i = 0, k = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (arrayInt[i] == arrayInt[j]) {
                    count++;
                }
            }
            if (count == 0) {
                b[k] = arrayInt[i];
                k++;
            }
        }
        Util.showArrayInt(b);
    }

    // Write a Java program to find the second largest element in an array.
    protected static void task17(int[] arrayInt) {
        System.out.println("========== Task 17 ==========");

        Util.showArrayInt(arrayInt);
        int n = arrayInt.length;
        int max = arrayInt[0];
        int second = arrayInt[0];
        for (int i = 1; i < n; i++) {
            if (arrayInt[i] > max) {
                second = max;
                max = arrayInt[i];
            } else {
                if (arrayInt[i] > second) {
                    second = arrayInt[i];
                }
            }
        }
        System.out.println("second max = " + second);
    }

    // Write a Java program to find the second smallest element in an array
    protected static void task18(int[] arrayInt) {
        System.out.println("========== Task 18 ==========");

        Util.showArrayInt(arrayInt);
        int n = arrayInt.length;
        int min = arrayInt[0];
        int second = arrayInt[0];

        for (int i = 1; i < n; i++) {
            if (arrayInt[i] < min) {
                second = min;
                min = arrayInt[i];
            } else {
                if (arrayInt[i] < second) {
                    second = arrayInt[i];
                }
            }
        }
        System.out.println("second min  = " + second);
    }

    // Write a Java program to add two matrices of the same size.
    protected static void task19() {
        System.out.println("========== Task 19 ==========");

        System.out.println("Enter matrix size");
        int n = Util.enterNumericIntData();

        int[][] matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = Util.generatedIntNum();
            }
        }

        int[][] matrixB = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixB[i][j] = Util.generatedIntNum();
            }
        }

        int[][] result = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    result[i][j] = matrixA[i][k] + matrixB[k][j];
                }
            }
        }
        Util.showMatrix(result);
    }

    // Write a Java program to convert an array to ArrayList.
    protected static void task20(String[] s) {
        System.out.println("========== Task 20 ==========");

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, s);
        for (String value : list) {
            System.out.println(value);
        }

    }
}