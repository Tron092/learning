package org.learn.designpatterns.creational.abstractfactory;

public class PostgresConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL Database");
    }
}
