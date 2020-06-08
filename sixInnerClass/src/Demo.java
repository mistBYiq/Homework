public class Demo {
    public static void main(String[] args) {
        Car car = new Car(1, 3000, "green");
        System.out.println(car.toString());
        System.out.println("before FuelConsumption " + car.getFuelConsumption());
        car.setFuelConsumption(14);
        System.out.println("after FuelConsumption " + car.getFuelConsumption());
        car.refuel();
        car.drive();

        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        System.out.println("All cars = " + Car.getCarCounter());

//1. Create anonymous class for object and run method that was overrided
        Car car6 = new Car(6, 1200, "black") {
            @Override
            public void refuel() {
                System.out.println("Refuel " + toString());
                System.out.println("before " + getAmountFuelInTank() + " liters");
                setAmountFuelInTank(105);
                System.out.println("after " + getAmountFuelInTank() + " liters");
            }
        };

        car6.refuel();
        car6.drive();
        System.out.println("FuelConsumption " + car6.getFuelConsumption());
        System.out.println("All cars = " + Car.getCarCounter());
    }
}
