package domain;

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

    @Override
    public int getCarryingCapacity() {
        return super.getCarryingCapacity();
    }

    @Override
    public void setCarryingCapacity(int carryingCapacity) {
        super.setCarryingCapacity(carryingCapacity);
    }

    @Override
    public int getTransportId() {
        return super.getTransportId();
    }

    @Override
    public void setTransportId(int transportId) {
        super.setTransportId(transportId);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public String getEnginesType() {
        return super.getEnginesType();
    }

    @Override
    public void setEnginesType(String enginesType) {
        super.setEnginesType(enginesType);
    }


    public Car(int transportId, int carryingCapacity, String enginesType, int weight,
               String color, int maxSpeed) {
        super(transportId, carryingCapacity, enginesType, weight);
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Включить двигатель. Начать движение");
    }

    @Override
    public void stay() {
        System.out.println("Остановиться. Выключить двигатель");
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
                "} " ;
    }



    @Override
    public void gearWear() {
        carryingCapacity--;
    }
}
