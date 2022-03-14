package main.java.com.mistiq.homework.fourth_car_plus.util;


import main.java.com.mistiq.homework.fourth_car_plus.domain.Car;
import main.java.com.mistiq.homework.fourth_car_plus.domain.Color;
import main.java.com.mistiq.homework.fourth_car_plus.domain.Engine;

public class CarGenerator {

    public static Car generateCar() {

        return new Car(transportId(), carryingCapacity(), enginesType(),
                weight(), color(), maxSpeed());
    }

    public static Car[] generateArrayCars(int num) {
        Car[] cars = new Car[num];
        for (int i = 0; i < num; i++) {
            cars[i] = generateCar();
        }

        return cars;
    }

    private static int transportId() {
        return random(1, Integer.MAX_VALUE);
    }

    private static int carryingCapacity() {
        return random(50, 200);
    }

    private static String enginesType() {
        String type = "DEFAULT";
        switch (random(1, 4)) {
            case 1:
                type = Engine.DIESEL.toString();
                break;
            case 2:
                type = Engine.PETROL.toString();
                break;
            case 3:
                type = Engine.GAS.toString();
                break;
            case 4:
                type = Engine.ELECTRIC.toString();
                break;
        }
        return type;
    }

    private static int weight() {
        return random(1500, 3500);
    }

    private static String color() {
        String color = "DEFAULT";
        switch (random(1, 5)) {
            case 1:
                color = Color.BLACK.toString();
                break;
            case 2:
                color = Color.WHITE.toString();
                break;
            case 3:
                color = Color.BLUE.toString();
                break;
            case 4:
                color = Color.RED.toString();
                break;
            case 5:
                color = Color.GREEN.toString();
                break;
        }
        return color;
    }

    private static int maxSpeed() {
        return random(60, 180);
    }

    private static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
