package patterns.decorator;

public class CarDriverAndForwardingAgent 
extends DriverDecorator {

public CarDriverAndForwardingAgent(Driver driver){
		super(driver);
	}
	private void addedBehaviorTwo() {
		System.out.println("I am a Forwarding Agent");
	}
	public void doo() {
		driver.doo();
		addedBehaviorTwo();
	}
}
