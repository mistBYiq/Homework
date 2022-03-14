package main.java.com.mistiq.homework.fourth_car_plus;// создать иерархию наследования на 3 уровня с абстрактным классом и 2-мя абстрактными методами,
// переопределить методы equals hashCode, toString,
// перегрузить и переопределить 2 метода в классах и конструкторах,
// продемонстрировать работу с массивами объектов из иерархии классов
// (сортировать по критериям, суммарный подсчет параметров и т.д.)
// + добавить имплементацию 2 своих интерфейсов


import main.java.com.mistiq.homework.fourth_car_plus.domain.Car;
import main.java.com.mistiq.homework.fourth_car_plus.util.CarGenerator;

import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.showArrayCar;
import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.showCar;
import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.sortCarryingCapacity;
import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.sortColor;
import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.sortEngineType;
import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.sortMaxSpeed;
import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.sortWeight;
import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.sumCarryingCapacity;
import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.sumMaxSpeed;
import static main.java.com.mistiq.homework.fourth_car_plus.util.CarUtil.sumWeight;

public class MainCar {

    public static void main(String[] args) {

        Car car = CarGenerator.generateCar();
        showCar(car);
        car.changeEngine();
        car.gearWear();
        car.repaint();
        showCar(car);
        System.out.println();

        Car[] cars = CarGenerator.generateArrayCars(5);
        showArrayCar(cars);

        System.out.println("Sort by color");
        sortColor(cars);
        showArrayCar(cars);

        System.out.println("Sort by speed");
        sortMaxSpeed(cars);
        showArrayCar(cars);

        System.out.println("Sort by Engines Type");
        sortEngineType(cars);
        showArrayCar(cars);

        System.out.println("Sort by Weight");
        sortWeight(cars);
        showArrayCar(cars);

        System.out.println("Sort by Carrying Capacity");
        sortCarryingCapacity(cars);
        showArrayCar(cars);

        System.out.println("Total weight  " + sumWeight(cars));
        System.out.println("Total max speed  " + sumMaxSpeed(cars));
        System.out.println("Total carrying capacity  " + sumCarryingCapacity(cars));
    }

}
