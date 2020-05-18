package core.exceptions.resources;

public class CloseableFail implements AutoCloseable {
private final String name;
public CloseableFail(String name) {
this.name = name;
}
public void close() throws Exception {
System.err.println("close:- Fail" + name);
throw new Exception("close:- Fail " + name);
}
}
