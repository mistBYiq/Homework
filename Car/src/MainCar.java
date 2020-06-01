import domain.Car;

import util.CarGenerator;

import java.util.Arrays;

import static util.CarUtil.showArrayCar;
import static util.CarUtil.sortColor;
import static util.CarUtil.sortMaxSpeed;
import static util.CarUtil.sumWeight;

public class MainCar {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        for (int i = 0; i < 5; i++) {
            cars[i] = CarGenerator.generate();
        }

        showArrayCar(cars);

        System.out.println("Сортировка по цвету");
        sortColor(cars);
        showArrayCar(cars);

        System.out.println("Сортировка по скорости");
        sortMaxSpeed(cars);
        showArrayCar(cars);

        System.out.println("Общий вес  " + sumWeight(cars));
    }


}
