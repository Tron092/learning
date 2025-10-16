package org.learn.designpatterns.behavioural.chainofresponsibility;

public class SupportAgent extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("support")) {
            System.out.println("Support Agent handled the request: " + request);
        } else {
            System.out.println("Support Agent cannot handle the request: " + request + ". Passing to next handler.");
            super.handleRequest(request);
        }
    }
}
