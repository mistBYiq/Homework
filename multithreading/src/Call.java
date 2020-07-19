import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

class Call implements Callable<String> {
    private String client = "Client ";

    // for the report to see what time the thread was running
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");

    public Call(int i) {
        this.client += i;
    }

    @Override
    public String call() {

        // imitate work
        System.out.println("calls " + client);
        long rand = ThreadLocalRandom.current().nextInt(1000,2000);

        // sleep Thread
        pause(rand);

        System.out.println(client + " contacted the " + Thread.currentThread().getName());

        pause(rand);

        System.out.println(client + " call ended");

        // for the report to see what time the thread was running
        Calendar calendar = new GregorianCalendar();
        return (dateFormat.format(calendar.getTime()) + "  " + client
                +  " spoke to the " + Thread.currentThread().getName());
    }

    public void pause(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}