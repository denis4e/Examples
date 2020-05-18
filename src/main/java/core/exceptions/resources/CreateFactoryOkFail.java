package core.exceptions.resources;

public class CreateFactoryOkFail extends AutoCloseableFactory {
private final String name;
public CreateFactoryOkFail(String name) {
this.name = name;
}
public CloseableFail create() throws Throwable {
System.err.println("create:" + name);
return new CloseableFail(name);
}

}
