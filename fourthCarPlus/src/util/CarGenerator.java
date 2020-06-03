package util;

import domain.Car;

public class CarGenerator {

    public static Car generate() {

        return new Car(transportId(),carryingCapacity(),enginesType(),
                weight(),color(),maxSpeed());
    }

    private static int transportId() {
        return random(1,Integer.MAX_VALUE);
    }

    private static int carryingCapacity() {
        return random(200, 2000);
    }

    private static String enginesType() {
        int n = random(1,4);
        String type = "";
        if(n == 1) {
            type = "petrol";
        }
        if(n == 2) {
            type = "diesel";
        }
        if(n == 3) {
            type = "gas";
        }
        if(n == 4) {
            type = "electric";
        }
        return type;
    }

    private static int weight() {
        return random(1000,5000);
    }

    private static String color() {
        int n = random(1,5);
        String color = "";
        if(n == 1) {
            color = "green";
        }
        if(n == 2) {
            color = "blue";
        }
        if(n == 3) {
            color = "black";
        }
        if(n == 4) {
            color = "red";
        }
        if(n == 5) {
            color = "white";
        }
        return color;
    }

    private static int maxSpeed() {
        return random(60, 180);
    }

    public static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
