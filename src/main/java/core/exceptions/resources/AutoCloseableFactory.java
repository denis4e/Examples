package core.exceptions.resources;

public abstract class AutoCloseableFactory {
	 public abstract AutoCloseable create() throws Throwable; 
}
