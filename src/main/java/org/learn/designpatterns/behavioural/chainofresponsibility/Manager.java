package org.learn.designpatterns.behavioural.chainofresponsibility;

public class Manager extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("manager")) {
            System.out.println("Manager handled the request: " + request);
        } else {
            System.out.println("Manager cannot handle the request: " + request + "invalid request.");

        }
    }
}
