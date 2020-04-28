package patterns.behavioral.chainOfResponsibility;

public class ConcreteHandler2 extends Handler {
    public void sendRequest(int request) {
        if (request >= 10 && request < 20) {
            System.out.println("handled request {" + request + "}" + this.getClass().getName());
        } else if (next != null) {
            System.out.println("ConcreteHandler2 go next!");
            next.sendRequest(request);
        }
    }
}
