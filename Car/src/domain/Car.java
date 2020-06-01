package domain;

import java.util.Objects;

public class Car extends GroundTransportation {

    protected String color;

    protected int maxSpeed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(int transportId, int carryingCapacity, String enginesType, int weight,
               String color, int maxSpeed) {
        super(transportId, carryingCapacity, enginesType, weight);
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void stay() {
        super.stay();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getMaxSpeed() != car.getMaxSpeed()) return false;
        return getColor() != null ? getColor().equals(car.getColor()) : car.getColor() == null;
    }

    @Override
    public int hashCode() {
        int result = getColor() != null ? getColor().hashCode() : 0;
        result = 31 * result + getMaxSpeed();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }
}
