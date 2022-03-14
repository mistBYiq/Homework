package main.java.com.mistiq.classwork.work_7;

import java.io.IOException;

public class ClickerDemo {

    public static void main(String[] args) throws InterruptedException, IOException {

        Clicker clicker = new Clicker();
        clicker.start();
        clicker.sleep(30);

        clicker.changeStopFlag();
        clicker.join();
    }
}