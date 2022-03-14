package main.java.com.mistiq.homework.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class CallCentre {

    private final int operatorNumber;
    private final int calls;
    private final String NAME = "Operator ";
    private int number = 0;

    // create a constructor that will initialize the call center and run
    public CallCentre(int operators, int calls) {
        this.operatorNumber = operators;
        this.calls = calls;
        workCallCentre();
    }

    private void workCallCentre() {
        System.out.println("START Call-Centre");

        // Create ThreadFactory. In this case it is needed to set the names of the thread
        ThreadFactory operatorsFactory = r -> {
            Thread operator = new Thread(r);
            operator.setName(NAME + number++);
            System.out.println("Start work : " + operator.getName());
            return operator;
        };

        // create threads (operators) through ExecutorService, which will process calls
        ExecutorService operatorExecutorService = Executors.newFixedThreadPool(operatorNumber, operatorsFactory);

        // create a report on the work of the call center to demonstrate Future's capabilities
        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < calls; i++) {
            Call client = new Call(i);
            Future<String> report = operatorExecutorService.submit(client);
            list.add(report);
        }

        // fall asleep to output the results to the console in order
        try {
            Thread.sleep(Long.parseLong("20000"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //showing a report on the work of the call center
        System.out.println("\nProgress report");
        for (Future<String> future : list) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Finish work Operators");
        // terminating threads
        operatorExecutorService.shutdown();
        System.out.println("Finish Call-Centre");
    }

}
