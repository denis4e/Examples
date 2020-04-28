package ex.resources;

public class AutoClosableResource implements AutoCloseable {

	private String name;
	public AutoClosableResource(String name) {
		this.name=name;
	}

	@Override
	public void close() throws Exception {	
		System.err.println("close:" + name);
	}   
}