package org.learn.designpatterns.creational.singleton;

public class Singleton {

    private static Singleton instance;

    // private constructor to prevent instantiation
    private Singleton() {
    }
    // public method to provide access to the instance but not thread-safe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //Thread-safe version using synchronized keyword on the method
    public static synchronized Singleton getInstanceThreadSafe() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
