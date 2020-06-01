package core.patterns.behavioral.chainOfResponsibility;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void sendRequest(int request);
}

