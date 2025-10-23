package org.learn.designpatterns.creational.abstractfactory;

public class MySqlConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("Connected to MySQL Database");
    }
}
