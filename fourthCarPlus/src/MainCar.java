// создать иерархию наследования на 3 уровня с абстрактным классом и 2-мя абстрактными методами,
// переопределить методы equals hashCode, toString,
// перегрузить и переопределить 2 метода в классах и конструкторах,
// продемонстрировать работу с массивами объектов из иерархии классов
// (сортировать по критериям, суммарный подсчет параметров и т.д.)
// + добавить имплементацию 2 своих интерфейсов

import domain.Car;

import util.CarGenerator;

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
