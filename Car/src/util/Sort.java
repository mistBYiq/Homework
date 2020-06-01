package util;

import domain.Car;

public class Sort {
    public static void sortColor(Car[] c) {
        Car temp ;
        boolean needSorted = true;
        while (needSorted) {
            needSorted = false;
            for (int i = 1; i < c.length; i++) {
                if (c[i-1].getColor().compareTo(c[i].getColor()) < 0) {
                    temp = c[i];
                    c[i] = c[i - 1];
                    c[i -1] = temp;
                    needSorted = true;
                }
            }
        }
    }
    public static void sortMaxSpeed(Car[] c) {
        int n = c.length;
        Car temp;
        boolean needSorted = true;
        while (needSorted) {
            needSorted = false;
            for (int i = 1; i < c.length; i++) {
                if (c[i - 1].getMaxSpeed() < c[i].getMaxSpeed()) {
                    temp = c[i];
                    c[i] = c[i - 1];
                    c[i - 1] = temp;
                    needSorted = true;
                }
            }
        }
    }
    public static int sumWeight(Car[] c) {
        int n = c.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += c[i].getWeight();
        }
        return sum;
    }
}
