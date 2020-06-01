package core.patterns.behavioral.chainOfResponsibility;

public class ConcreteHandler3 extends Handler {
    public void sendRequest(int request) {
        if (request >= 20 && request < 30) {
            System.out.println("handled request { " + request + " }" + this.getClass().getName());
        } else if (next != null) {
            System.out.println("ConcreteHandler3 go next!");
            next.sendRequest(request);
        }
    }
}
