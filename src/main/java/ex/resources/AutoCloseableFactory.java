package ex.resources;

public abstract class AutoCloseableFactory {
	 public abstract AutoCloseable create() throws Throwable; 
}
