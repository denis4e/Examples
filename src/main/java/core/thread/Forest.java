package core.thread;

public class Forest implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Forest core.thread-" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Forest core.thread interrupted");
        }
        System.out.println("Exiting Forest core.thread");
    }
}


