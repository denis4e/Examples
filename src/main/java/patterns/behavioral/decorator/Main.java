package patterns.behavioral.decorator;

public class Main {
    public static void main(String args[]) {
        doDrive(new CarDriver());
        doDrive(new BusDriver(new CarDriver()));
        doDrive(new CarDriverAndForwardingAgent(new BusDriver(new CarDriver())));
    }

    public static void doDrive(Driver driver) {
        driver.doo();
    }
}
