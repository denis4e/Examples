package ex.resources;

public class BodyFail implements TryBody {
public void runBody() throws Exception {
System.err.println("body-fail");
throw new Exception ("body-fail");
}
}
