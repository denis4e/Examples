package patterns.creational.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton s1 = new Singleton();
        s1.getInstance();
        s1.number = 1;

        Singleton s2 = Singleton.getInstance();
        s2.number = 2;
        System.out.println("Number of instance " + s1.number);
        System.out.println("Number of instance " + s2.number);
    }

    private static class Singleton {
        private static Singleton instance;

        private int number = 0;

        static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}