public class Car {
    public static final String BASE_NAME = "AUTO";
    private static int carCounter = 0;

    public final String madeIn = "Belarus";

    private int fuelConsumption = 12;

    private int carId;

    private float weight;

    private String color;

    private int amountFuelInTank;

    public Car() {
        setCarCounter(carCounter);
    }

    public Car(int carId, float weight, String color) {
        this.carId = carId;
        this.weight = weight;
        this.color = color;
        setCarCounter(carCounter);
    }

    public static String getBaseName() {
        return BASE_NAME;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

// 2. Create local class, create method and call method через вызов метода, внутри которого описан класс
    public void setFuelConsumption(int fuelConsumption) {
        class FuelConsumption {
            private int fuelConsumption;

            public FuelConsumption(int fuelConsumption) {
                this.fuelConsumption = fuelConsumption;
            }

            public int getFuelConsumption() {
                return fuelConsumption;
            }

            public void setFuelConsumption(int fuelConsumption) {
                this.fuelConsumption = fuelConsumption;
            }
        }
        this.fuelConsumption = new FuelConsumption(fuelConsumption).getFuelConsumption();
    }

    public static int getCarCounter() {
        return carCounter;
    }

    public static void setCarCounter(int carCounter) {
        Car.carCounter++;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmountFuelInTank() {
        return amountFuelInTank;
    }

    public void setAmountFuelInTank(int amountFuelInTank) {
        this.amountFuelInTank = amountFuelInTank;
    }

    public void drive() {
        if(getAmountFuelInTank() > 0) {
            System.out.println("Rode the way " + (getAmountFuelInTank()/ getFuelConsumption() * 100) + " km");
        } else {
            System.out.println("Need to refuel");
        }

    }

    public void refuel() {
        System.out.println("Refuel");
        System.out.println("fuel before refueling " + getAmountFuelInTank() + " liters");
        setAmountFuelInTank(80);
        System.out.println("fuel after refueling " + getAmountFuelInTank() + " liters");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getFuelConsumption() != car.getFuelConsumption()) return false;
        if (getCarId() != car.getCarId()) return false;
        if (Float.compare(car.getWeight(), getWeight()) != 0) return false;
        if (getAmountFuelInTank() != car.getAmountFuelInTank()) return false;
        if (!getMadeIn().equals(car.getMadeIn())) return false;
        return getColor().equals(car.getColor());
    }

    @Override
    public int hashCode() {
        int result = getMadeIn().hashCode();
        result = 31 * result + getFuelConsumption();
        result = 31 * result + getCarId();
        result = 31 * result + (getWeight() != +0.0f ? Float.floatToIntBits(getWeight()) : 0);
        result = 31 * result + getColor().hashCode();
        result = 31 * result + getAmountFuelInTank();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "MADE_IN='" + madeIn + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", carId=" + carId +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", amountFuelInTank=" + amountFuelInTank +
                '}';
    }
}