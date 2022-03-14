package main.java.com.mistiq.homework.third_car;

public class Main {

    public static void main(String[] args) {
        CarUtil util = new CarUtil();
        Car car = util.generateCar();

        System.out.println(car);
        System.out.println(CarUtil.determineTypeCar(car));
    }
}
