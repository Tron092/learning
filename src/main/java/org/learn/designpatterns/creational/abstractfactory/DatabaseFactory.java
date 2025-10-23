package org.learn.designpatterns.creational.abstractfactory;

public interface DatabaseFactory {
    Connection createConnection();
    Query createQuery();
}
