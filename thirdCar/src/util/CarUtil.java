package util;

import domain.Car;

public class CarUtil {
    public static String determineTypeCar(Car car) {
        String type = "";
        switch (car.getCarWeight()) {
            case(1500):
                type = "passenger";
                break;
            case(2500):
                type = "jeep";
                break;
            case(3500):
                type = "cargo";
                break;
            default:
                type = "default";
                break;
        }
        return type;
    }

    public Car generateCar() {
        int weight = 0;
        String color = "";
        long id = random(100000, 1000000);

        int temp = random(1, 3);
        if (temp == 1) {
            weight = 1500;
        }
        if (temp == 2) {
            weight = 2500;
        }
        if (temp == 3) {
            weight = 3500;
        }

        switch (random(1,5)) {
            case 1:
                color = "green";
                break;
            case 2:
                color = "blue";
                break;
            case 3:
                color = "white";
                break;
            case 4:
                color = "black";
                break;
            case 5:
                color = "red";
                break;
        }

        return new Car(weight,color,id);
    }

    private static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
