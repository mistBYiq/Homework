package main.java.com.mistiq.homework.fourth_car_plus.domain;

public class Car extends GroundTransportation implements Upgrading {

    protected String color;

    protected int maxSpeed;

    public Car() {
    }

    public Car(int transportId, int carryingCapacity, String enginesType, int weight,
               String color, int maxSpeed) {
        super(transportId, carryingCapacity, enginesType, weight);
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

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

    @Override
    public void move() {
        System.out.println("Turn on the engine. Start movement");
    }

    @Override
    public void stay() {
        System.out.println("Stay. Turn off engine");
    }

    @Override
    public void gearWear() {
        this.carryingCapacity--;
    }

    @Override
    public void changeEngine() {
        this.enginesType = "ROTARY PISTON";
        this.maxSpeed--;
    }

    @Override
    public void repaint() {
        this.color = "NAVY BLUE";
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
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", enginesType='" + enginesType + '\'' +
                ", weight=" + weight +
                ", transportId=" + transportId +
                ", carryingCapacity=" + carryingCapacity +
                "} ";
    }


}
