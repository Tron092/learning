package org.learn.designpatterns.behavioural.observer;

public class ObserverDemo {
    public static void main(String[] args) {

        Channel channel = new Channel("learning java design patterns");
        String message = "New video  Observer pattern";
        Observer user1 = new Subscriber("Alice");
        Observer user2 = new Subscriber("Bob");
        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.notifySubscribers(message);
    }
}
