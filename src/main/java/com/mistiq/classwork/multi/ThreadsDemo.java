package main.java.com.mistiq.classwork.multi;

public class ThreadsDemo {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Thread car = new Thread(new Car());

        truck.setPriority(1);
        car.setPriority(10);

        System.out.println(truck.getName() + " started!");
        truck.start(); //start -> run
        System.out.println(car.getName() + " started!");
        car.start();
    }
}
