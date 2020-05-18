package core.exceptions.resources;

public class BodyOk implements TryBody{

	@Override
	public void runBody() throws Exception {
		System.err.println("body");
		
	}

}
