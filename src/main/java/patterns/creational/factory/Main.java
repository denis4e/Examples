package patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car toyota = carFactory.create("Toyota");
        toyota.drive();
        Car audi = carFactory.create("Audi");
        audi.drive();
    }
}

interface Car {
    void drive();
}

class Toyota implements Car {

    @Override
    public void drive() {
        System.out.println("drive Toyota");
    }
}

class Audi implements Car {

    @Override
    public void drive() {
        System.out.println("drive Audi");
    }
}

class CarFactory {
    public Car create(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("TOYOTA")) {
            return new Toyota();

        } else if (type.equalsIgnoreCase("AUDI")) {
            return new Audi();

        }
        return null;
    }
}


