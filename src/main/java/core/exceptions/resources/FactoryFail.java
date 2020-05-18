package core.exceptions.resources;

public class FactoryFail extends AutoCloseableFactory {
private final String name;
public FactoryFail(String name) {
this.name = name;
}
public AutoCloseable create() throws Throwable {
System.err.println("create: -Fail" + name);
throw new Exception("create: - Fail" + name);
}
}
