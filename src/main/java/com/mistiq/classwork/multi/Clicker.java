package main.java.com.mistiq.classwork.multi;

public class Clicker extends Thread {
    private long click = 0;
    private volatile boolean stopFlag = false;

    public void run() {
        while (!stopFlag) {
            click++;
            System.out.println(click);
        }
    }

    public void changeStopFlag() {
        stopFlag = true;
    }

    public long getClick() {
        return click;
    }
}
