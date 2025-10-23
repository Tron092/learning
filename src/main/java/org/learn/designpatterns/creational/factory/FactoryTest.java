package org.learn.designpatterns.creational.factory;

public class FactoryTest {
    public static void main(String[] args) {
        // Using the simple factory method
        //Notification emailNotification1 = NotificationFactory.getNotification("EMAIL");
        //emailNotification1.notifyUser();

        //Notification smsNotification1 = NotificationFactory.getNotification("SMS");
        //smsNotification1.notifyUser();

        // Using the pooled factory method
        Notification emailNotification2 = NotificationFactory.getPooledNotification("EMAIL");
        emailNotification2.notifyUser();

        Notification smsNotification2 = NotificationFactory.getPooledNotification("SMS");
        smsNotification2.notifyUser();

        // Adding a new notification type dynamically
        Notification pushNotification = new Notification() {
            @Override
            public void notifyUser() {
                System.out.println("Sending a Push notification");
            }
        };
        String result = NotificationFactory.addNewNotificationType("PUSH", PushNotification::new);
        System.out.println(result);

        Notification pushNotificationInstance = NotificationFactory.getPooledNotification("PUSH");
        pushNotificationInstance.notifyUser();
    }
}
