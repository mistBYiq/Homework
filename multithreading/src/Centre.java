
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.logging.Logger;

public class Centre {
    private static final Logger LOGGER = LoggerUtil.getFormattedLogger(
            Centre.class.getSimpleName()
    );
    private static final int NUMBER_OPERATORS = 5;

    private static final int NUMBER_CALLS = 10;

    private static final Semaphore SEMAPHORE = new Semaphore(NUMBER_OPERATORS, true);

    private static final boolean[] OPERATORS = new boolean[NUMBER_OPERATORS];

    private static List<Thread> waitingList = new ArrayList<>();

    void working() {
        LOGGER.info("START work Call Centre");
        Thread[] client = new Thread[NUMBER_CALLS];
        Arrays.setAll(client, this::createClient);

        for (Thread value : client) {
            value.start();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                LOGGER.throwing("Centre", "working", e);
            }
        }

        Arrays.stream(client).forEach((thread) -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                LOGGER.throwing("Centre", "working", e);
            }
        });
        LOGGER.info("FINNISH work Call-Centre");
    }

    private Thread createClient(int id) {
        return new Thread(
                () -> receiveСalls(),
                "Client " + id
        );
    }

    public static boolean determineIfOperatorIsFree() {
        boolean temp = false;
        for (boolean operator : OPERATORS) {
            if (!operator) {
                temp = true;
                break;
            }
        }
        return temp;
    }

    public static void receiveСalls() {
        String threadName = Thread.currentThread().getName();
        LOGGER.info("Called the call center " + threadName);
        if (!determineIfOperatorIsFree()) {
            LOGGER.info("On the waiting list " + threadName);
            waitingList.add(Thread.currentThread());
        }

        try {
            SEMAPHORE.acquire();
            int operatorNumber = 0;
            for (int i = 0; i < OPERATORS.length; i++) {
                if (!OPERATORS[i]) {
                    OPERATORS[i] = true;
                    operatorNumber = i;
                    LOGGER.info(threadName + " started talking to the operator " + operatorNumber );
                    Thread.sleep(3000);
                    break;
                }
            }
            OPERATORS[operatorNumber] = false;

        } catch (InterruptedException e1) {
            LOGGER.throwing("Centre","receiveСalls " + threadName, e1);
        } finally {
            LOGGER.info("finished the call " + threadName);
            SEMAPHORE.release();
        }
    }

}
