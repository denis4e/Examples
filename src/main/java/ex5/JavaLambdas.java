package ex5;

public class JavaLambdas {
    public static void main(String[] args) {
        CarFilter carFilter = new CarFilter() {
            @Override
            public boolean filter(Car car) {
                return car.getYear() >= 2020;
            }
        };

        CarFilter carFilterLambda = car -> car.getYear() >= 2020;

        Car car = new Car();
        car.setYear(2021);
        doExampleCall(car, carFilterLambda);
        doExampleCall(car, vehicle -> vehicle.getYear() >= 2021);
    }

    private static void doExampleCall(Car car, CarFilter carFilterLambda) {
        boolean result = carFilterLambda.filter(car);
        System.out.println(result);
    }
}

interface CarFilter {
    boolean filter(Car car);
}

class Car {
    int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

