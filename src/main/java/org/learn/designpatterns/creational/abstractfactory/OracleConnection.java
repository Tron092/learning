package org.learn.designpatterns.creational.abstractfactory;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connected to Oracle Database");
    }
}
