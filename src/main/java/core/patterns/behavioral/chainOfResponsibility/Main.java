package core.patterns.behavioral.chainOfResponsibility;

public class Main {


    public static void main(String[] args) {
        // Setup Chain of Responsibility
        Handler h1 = new ConcreteHandler1();
        ConcreteHandler2 h2 = new ConcreteHandler2();
        ConcreteHandler3 h3 = new ConcreteHandler3();
        h1.setNext(h2);
        h2.setNext(h3);
        h1.sendRequest(24);

    }

}
