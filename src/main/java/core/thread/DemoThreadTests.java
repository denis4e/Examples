package core.thread;

public class DemoThreadTests {

    public static void main(String args[]) {
        DemoRunnable thread1 = new DemoRunnable();
        Thread thread = new Thread(thread1);
        thread.start();

        DemoThread demoThread = new DemoThread();
        demoThread.start();

        new Thread(() -> System.out.println("core.thread with lambda")).start();
    }
}