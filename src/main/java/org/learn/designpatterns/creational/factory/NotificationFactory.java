package org.learn.designpatterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {
//    public static Notification getNotification(String type) {
//        if (type == null || type.isEmpty()) {
//            return null;
//        } else if (type.equalsIgnoreCase("EMAIL")) {
//            return new EmailNotification();
//        } else if (type.equalsIgnoreCase("SMS")) {
//            return new SmsNotification();
//        } else {
//            throw new IllegalArgumentException("Unknown notification type: " + type);
//        }
//    }

    private static final Map<String, Supplier<Notification>> notificationMap = new HashMap<>();

    static {
        notificationMap.put("EMAIL", EmailNotification::new);
        notificationMap.put("SMS", SmsNotification::new);
    }

    public static Notification getPooledNotification(String type) {
        Supplier<Notification> notification = notificationMap.get(type.toUpperCase());
        if (notification != null) {
            return notification.get();
        }
        throw new IllegalArgumentException("Unknown notification type: " + type);
    }
    public static String addNewNotificationType(String type, Supplier<Notification> notification) {
        if (type == null || type.isEmpty() || notification == null) {
            throw new RuntimeException("Notification type and instance cannot be null or empty");
        }
        notificationMap.put(type.toUpperCase(), notification);
        return "Notification type " + type + " added successfully.";
    }
}
