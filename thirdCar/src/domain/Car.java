// Создать класс domain.Car с 3 полями различных типов,
// 2 конструкторами, один из которых с параметрами.
// В классе создать 2 метода, статический и не статический.
// Один из методов решает по весу машины ее тип: легковой, джип, грузовой (через свитч).
// Второй метод генерирует рандомную машину.

package domain;

public class Car {

    public static final String baseName = "AUTOMOBILE";

    private int carWeight;

    private String carColor;

    private long carId;

    public int getCarWeight() {
        return carWeight;
    }

    public String getCarColor() {
        return carColor;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarWeight(int carWeight) {
        this.carWeight = carWeight;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carWeight=" + carWeight +
                ", carColor='" + carColor + '\'' +
                ", carId=" + carId +
                '}';
    }

    public Car(int carWeight, String carColor, long carId) {
        this.carWeight = carWeight;
        this.carColor = carColor;
        this.carId = carId;
    }

}
