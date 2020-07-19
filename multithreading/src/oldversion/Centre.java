package oldversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Centre {
    private static final Logger LOGGER = LoggerUtil.getFormattedLogger(
            Centre.class.getSimpleName());
    private static final int NUMBER_OPERATORS = 5;
    private static final int NUMBER_CALLS = 15;
    private static final Semaphore SEMAPHORE = new Semaphore(NUMBER_OPERATORS, true);

    public static List<Thread> waitingList = new ArrayList<>();
    public static List<Operator> operators = new ArrayList<>() ;

    private void working() {
        LOGGER.info("START work Call oldversion.Centre");
        //create and start operators
        IntStream.range(0, NUMBER_OPERATORS).forEach(i -> {
            operators.add(createOperator(i));
            operators.get(i).start();
        });

        //create clients
        Thread[] client = new Thread[NUMBER_CALLS];
        Arrays.setAll(client, this::createClient);

        for (Thread value : client) {
            value.start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                LOGGER.throwing("oldversion.Centre", "working", e);
            }
        }

        //attach everything to the main thread to complete sequentially
        Arrays.stream(client).forEach((thread) -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                LOGGER.throwing("oldversion.Centre", "working", e);
            }
        });

        for (Operator operator : operators) {
            try {
                operator.join();
            } catch (InterruptedException e) {
                LOGGER.throwing("oldversion.Centre", "working", e);
            }
        }
        LOGGER.info("FINNISH work Call-oldversion.Centre");
    }

    private Operator createOperator(int id) {
        return new Operator(id);
    }

    private Thread createClient(int id) {
        //
        return new Thread(
                () -> receiveСalls(),
                "Client " + id
        );
    }

    public static boolean determineIfOperatorIsFree() {
        boolean temp = false;
        for (Operator operator : operators) {
            if (!operator.isStatus()) {
                temp = true;
                break;
            }
        }
        return temp;
    }

    public static void receiveСalls() {
        String threadName = Thread.currentThread().getName();
        LOGGER.info("Called the call center " + threadName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            LOGGER.throwing("oldversion.Centre", "receiveСalls", e);
        }
        if (!determineIfOperatorIsFree()) {
            LOGGER.info("on the waiting list " + threadName);
            waitingList.add(Thread.currentThread());
        }

        try {
            SEMAPHORE.acquire();
            if (waitingList.contains(Thread.currentThread())) {
                waitingList.remove(Thread.currentThread());
                LOGGER.info("OUT of the waiting list" + threadName);
            }
            int operatorNumber = -1;
            for (int i = 0; i < operators.size(); i++) {
                if (!operators.get(i).isStatus()) {
                    LOGGER.info(threadName + " started talking to the " + operators.get(i).getName());
                    operators.get(i).setStatusTrue();
                    operatorNumber = i;

                    Thread.sleep(3000);
                    break;
                }
            }
            operators.get(operatorNumber).setStatusFalse();

        } catch (InterruptedException e1) {
            LOGGER.throwing("oldversion.Centre", "receiveСalls " + threadName, e1);
        } finally {
            LOGGER.info("finished the call " + threadName);
            SEMAPHORE.release();
        }
    }

    class Operator extends Thread {
        private boolean status;
        private int countCell;
        private int id;

        public Operator(int id) {
            this.status = false;
            this.countCell = 0;
            this.setName("Operator " + id);
            this.id = id;
        }

        @Override
        public long getId() {
            return id;
        }

        public int getCountCell() {
            return countCell;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatusTrue() {
            //interaction occurs Client inside Operator
            LOGGER.info(Thread.currentThread().getName() + " speak OPERATOR " + getId());
            this.countCell++;
            this.status = true;
        }

        public void setStatusFalse() {
            this.status = false;
        }

        @Override
        public void run() {
            LOGGER.info("Start work Operator " + getId());

            try {
                //there should have been a cool method, but for now just sleep
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                LOGGER.throwing("Operator", "run", e);
            }
            if (waitingList.isEmpty()) {
                LOGGER.info("WOW go home!!!");
            }
            LOGGER.info("finish work operator " + getId());
        }
    }

    public static void main(String[] args) {
        new Centre().working();
    }
}
