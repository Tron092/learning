package org.learn.designpatterns.creational.factory;

public class SmsNotification implements Notification {
    public SmsNotification() {
        System.out.println("SmsNotification instance created");
    }
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
