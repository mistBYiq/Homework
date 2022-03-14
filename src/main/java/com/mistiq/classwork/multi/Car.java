package main.java.com.mistiq.classwork.multi;

public class Car implements Runnable {

    @Override
    public void run() {
        System.out.println("Car implementation + " + Thread.currentThread().getName());
    }
}
