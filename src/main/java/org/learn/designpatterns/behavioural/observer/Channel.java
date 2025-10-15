package org.learn.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String channelName;

    public Channel(String channelName) {
        this.channelName = channelName;
    }
    List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }
    public void notifySubscribers(String message) {
        subscribers.forEach(subscriber -> subscriber.update(message+" on channel "+channelName));
    }
}
