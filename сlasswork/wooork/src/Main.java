import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        ExecutorService atomicIncrement = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            atomicIncrement.submit(atomicInteger::incrementAndGet);
        }
        atomicIncrement.shutdown();
        Thread.sleep(5000);
        System.out.println(atomicInteger.get());

        showTwo();

        showThree();

    }

    public static void showTwo() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ScheduledExecutorService atomicScheduledIncrement = Executors.newScheduledThreadPool(2);
        for (int i = 0; i < 10_000; i++) {
            atomicScheduledIncrement.schedule(atomicInteger::incrementAndGet,40, TimeUnit.MILLISECONDS);
        }
        TimeUnit.MILLISECONDS.sleep(100);

        atomicScheduledIncrement.shutdown();
        System.out.println(atomicInteger.get());
    }

    public static void showThree() {
        long start = System.currentTimeMillis();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ScheduledExecutorService atomicScheduledIncrement = Executors.newScheduledThreadPool(2);
        ScheduledFuture<Integer> scheduledFuture = null;

        for (int i = 0; i < 10_000; i++) {
            scheduledFuture = atomicScheduledIncrement.schedule(atomicInteger::incrementAndGet,100, TimeUnit.MILLISECONDS);
        }

        try {
            System.out.println(scheduledFuture.get(1, TimeUnit.SECONDS));
            System.out.println("Proces time : " + (System.currentTimeMillis() - start));
        }
        catch (TimeoutException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
