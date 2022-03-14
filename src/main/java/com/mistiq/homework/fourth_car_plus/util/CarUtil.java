package main.java.com.mistiq.homework.fourth_car_plus.util;


import main.java.com.mistiq.homework.fourth_car_plus.domain.Car;

public class CarUtil {

    public static void showCar(Car car) {
        System.out.println(car);
    }

    public static void showArrayCar(Car[] cars) {
        int n = cars.length;
        for (int i = 0; i < n; i++) {
            showCar(cars[i]);

        }
    }

    public static void sortColor(Car[] cars) {
        Car temp;
        boolean needSorted = true;
        while (needSorted) {
            needSorted = false;
            for (int i = 1; i < cars.length; i++) {
                if (cars[i - 1].getColor().compareTo(cars[i].getColor()) < 0) {
                    temp = cars[i];
                    cars[i] = cars[i - 1];
                    cars[i - 1] = temp;
                    needSorted = true;
                }
            }
        }
    }

    public static void sortMaxSpeed(Car[] cars) {
        Car temp;
        boolean needSorted = true;
        while (needSorted) {
            needSorted = false;
            for (int i = 1; i < cars.length; i++) {
                if (cars[i - 1].getMaxSpeed() < cars[i].getMaxSpeed()) {
                    temp = cars[i];
                    cars[i] = cars[i - 1];
                    cars[i - 1] = temp;
                    needSorted = true;
                }
            }
        }
    }

    public static void sortEngineType(Car[] cars) {
        Car temp;
        boolean needSorted = true;
        while (needSorted) {
            needSorted = false;
            for (int i = 1; i < cars.length; i++) {
                if (cars[i - 1].getEnginesType().compareTo(cars[i].getEnginesType()) < 0) {
                    temp = cars[i];
                    cars[i] = cars[i - 1];
                    cars[i - 1] = temp;
                    needSorted = true;
                }
            }
        }
    }

    public static void sortWeight(Car[] cars) {
        Car temp;
        boolean needSorted = true;
        while (needSorted) {
            needSorted = false;
            for (int i = 1; i < cars.length; i++) {
                if (cars[i - 1].getWeight() < cars[i].getWeight()) {
                    temp = cars[i];
                    cars[i] = cars[i - 1];
                    cars[i - 1] = temp;
                    needSorted = true;
                }
            }
        }
    }

    public static void sortCarryingCapacity(Car[] cars) {
        Car temp;
        boolean needSorted = true;
        while (needSorted) {
            needSorted = false;
            for (int i = 1; i < cars.length; i++) {
                if (cars[i - 1].getCarryingCapacity() < cars[i].getCarryingCapacity()) {
                    temp = cars[i];
                    cars[i] = cars[i - 1];
                    cars[i - 1] = temp;
                    needSorted = true;
                }
            }
        }
    }

    public static int sumWeight(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getWeight();
        }
        return sum;
    }

    public static int sumMaxSpeed(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getMaxSpeed();
        }
        return sum;
    }

    public static int sumCarryingCapacity(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getCarryingCapacity();
        }
        return sum;
    }

}
