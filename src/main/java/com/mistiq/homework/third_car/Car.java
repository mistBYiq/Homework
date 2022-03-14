// Создать класс domain.Car с 3 полями различных типов,
// 2 конструкторами, один из которых с параметрами.
// В классе создать 2 метода, статический и не статический.
// Один из методов решает по весу машины ее тип: легковой, джип, грузовой (через свитч).
// Второй метод генерирует рандомную машину.

package main.java.com.mistiq.homework.third_car;

public class Car {

    private static final String BASE_NAME = "AUTOMOBILE";

    private int carWeight;

    private String carColor;

    private long carId;

    public Car() {
    }

    public Car(int carWeight, String carColor, long carId) {
        this.carWeight = carWeight;
        this.carColor = carColor;
        this.carId = carId;
    }

    public static String getBaseName() {
        return BASE_NAME;
    }

    public int getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "Car{" +
                "BASE_NAME=" + BASE_NAME +
                ", carWeight=" + carWeight +
                ", carColor='" + carColor + '\'' +
                ", carId=" + carId +
                '}';
    }
}
