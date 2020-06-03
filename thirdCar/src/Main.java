import domain.Car;
import util.CarUtil;
public class Main {

    public static void main(String[] args) {
        CarUtil util = new CarUtil();
        Car car = util.generateCar();

        System.out.println(car);
        System.out.println(CarUtil.determineTypeCar(car));
    }
}
