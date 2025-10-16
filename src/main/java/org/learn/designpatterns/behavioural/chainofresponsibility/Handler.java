package org.learn.designpatterns.behavioural.chainofresponsibility;

public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public  void handleRequest(String request){
        if (next != null) {
            next.handleRequest(request);
        }
    }
}
