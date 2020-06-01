import domain.Car;

import util.CarGenerator;

import java.util.Arrays;

import static util.Sort.sortColor;
import static util.Sort.sortMaxSpeed;
import static util.Sort.sumWeight;

public class MainCar {
    public static void main(String[] args) {

        Car[] cars = new Car[5];
        for (int i = 0; i < 5; i++) {
            cars[i] = CarGenerator.generate();
        }
        
        Arrays.asList(cars).forEach(System.out::println);
        sortColor(cars);
        System.out.println("Сортировка по цвету");
        Arrays.asList(cars).forEach(System.out::println);
        System.out.println("Сортировка по скорости");
        sortMaxSpeed(cars);
        Arrays.asList(cars).forEach(System.out::println);
        System.out.println("Общий вес  " + sumWeight(cars));
    }


}
