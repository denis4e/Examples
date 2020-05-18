package patterns.behavioral.decorator;

public abstract class DriverDecorator extends Driver {
	protected Driver driver;

	public DriverDecorator(Driver driver) {
		this.driver = driver;
	}
	public void doo() {
		driver.doo();
	}
}
