package patterns.decorator;

public class BusDriver extends DriverDecorator {

	public BusDriver(Driver driver) {
		super(driver);
	}
	private void addedBehaviorOne() {
		System.out.println("I am bus driver");
	}
	public void doo() {
		driver.doo();
		addedBehaviorOne();
	}
}
