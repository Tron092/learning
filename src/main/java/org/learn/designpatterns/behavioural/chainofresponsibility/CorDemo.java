package org.learn.designpatterns.behavioural.chainofresponsibility;

public class CorDemo {
    public static void main(String[] args) {
        Handler supportAgent = new SupportAgent();
        Handler teamLead = new TeamLead();
        Handler manager = new Manager();

        supportAgent.setNext(teamLead);
        teamLead.setNext(manager);

        String[] requests = {"support", "teamlead", "manager", "invalid"};

        for (String request : requests) {
            System.out.println("\nProcessing request: " + request);
            supportAgent.handleRequest(request);
        }
    }
}
