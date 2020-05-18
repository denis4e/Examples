package core.thread;

public class DemoThread extends Thread {
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Demo core.thread - " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Demo  Thread interrupted");
        }
        System.out.println("Exiting Demo Thread");

    }
}
