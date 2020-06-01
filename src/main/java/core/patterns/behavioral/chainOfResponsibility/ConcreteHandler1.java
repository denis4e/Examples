package core.patterns.behavioral.chainOfResponsibility;

public class ConcreteHandler1 extends Handler {
    public void sendRequest(int request) {
        if (request >= 0 && request < 10) {
            System.out.println("handled request {" + request + "}" + this.getClass().getName());
        } else if (next != null) {
            System.out.println("ConcreteHandler1 go next!");
            next.sendRequest(request);
        }
    }
}
