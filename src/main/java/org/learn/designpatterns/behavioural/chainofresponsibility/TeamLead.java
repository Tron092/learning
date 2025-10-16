package org.learn.designpatterns.behavioural.chainofresponsibility;

public class TeamLead extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("teamlead")) {
            System.out.println("Team Lead handled the request: " + request);
        } else {
            System.out.println("Team Lead cannot handle the request: " + request + ". Passing to next handler.");
            super.handleRequest(request);
        }
    }
}
