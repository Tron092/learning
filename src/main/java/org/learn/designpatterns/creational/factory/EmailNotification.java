package org.learn.designpatterns.creational.factory;

public class EmailNotification implements Notification {

    public EmailNotification() {
        System.out.println("EmailNotification instance created");
    }
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}
