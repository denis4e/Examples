package patterns.creational.singleton;

public class Main {
    private static Singleton instance = null;

    public static void main(String[] args) {
        Singleton s = new Singleton();
        s.getInstance();
        Singleton ss = new Singleton();
        ss.getInstance();
    }

    private static class Singleton {
        Singleton getInstance() {
            if (instance == null) {
                System.out.println("Creating singleton");
                instance = new Singleton();
            }
            return instance;
        }
    }
}