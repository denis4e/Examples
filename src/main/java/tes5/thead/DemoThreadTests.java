package tes5.thead;

public class DemoThreadTests {

    public static void main(String args[]) {
        DemoRunnable thread1 = new DemoRunnable();
        Thread thread = new Thread(thread1);
        thread.start();

        DemoThread demoThread = new DemoThread();
        demoThread.run();

        new Thread(() -> System.out.println("thread with lambda")).start();
    }
}