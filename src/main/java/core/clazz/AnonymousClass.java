package core.clazz;

public class AnonymousClass {
    private static String abbr = "class";

    static Inner demo = new Inner() {
        @Override
        public void show() {
            super.show();
            System.out.println("Метод внутреннего анонимного класса");
        }
    };

    static Hello hello = new Hello() {
        @Override
        public void show() {
            System.out.println("Метод внутреннего анонимного класса - интерфейса");
        }
    };
    public static void main(String[] args) {
        demo.show();
        hello.show();
    }
}


// Simple Nested Inner Class
class Inner {
    public void show() {
        System.out.println("Anonymous Class ");
    }
}

interface Hello {
    void show();
}

