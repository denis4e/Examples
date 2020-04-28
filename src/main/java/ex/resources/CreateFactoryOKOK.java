package ex.resources;

public class CreateFactoryOKOK extends AutoCloseableFactory{
	   private final String name; 
	    public CreateFactoryOKOK(String name) { 
	        this.name = name; 
	    } 
	 public AutoClosableResource create() throws Throwable { 
	    	System.err.println("create:" + name);
	    	return new AutoClosableResource(name); 
	    } 


}
