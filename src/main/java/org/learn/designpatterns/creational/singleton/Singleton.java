package org.learn.designpatterns.creational.singleton;

public class Singleton {

    private static volatile Singleton instance;

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

    // Double-checked locking for better performance
    public static Singleton getInstanceDoubleChecked() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
