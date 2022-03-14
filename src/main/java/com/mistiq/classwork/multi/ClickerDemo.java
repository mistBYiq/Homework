package main.java.com.mistiq.classwork.multi;

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