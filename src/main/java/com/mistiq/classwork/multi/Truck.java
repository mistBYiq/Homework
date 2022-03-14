package main.java.com.mistiq.classwork.multi;

public class Truck extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Truck implementation start!");
            for (int i = 0; i < 5; i++) {
                System.out.println("Implementation running...");
                Thread.sleep(1000);
            }
            System.out.println("Truck implementation finish! + " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
