package tes5.thead;

public class DemoRunnable implements Runnable {
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("DemoRunnable - " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("DemoRunnable interrupted");
        }
        System.out.println("Exiting DemoRunnable");
    }
}
