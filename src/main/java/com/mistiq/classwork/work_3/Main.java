package main.java.com.mistiq.classwork.work_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add("list" + i);
        }
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();


        long finish = System.currentTimeMillis();
        System.out.println("\ntime work " + (finish - start) + " millis");
    }
}
