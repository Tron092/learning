package org.learn.designpatterns.creational.abstractfactory;

public class OracleQuery implements Query {
    @Override
    public void execute(String sql) {
        System.out.println("Executing Oracle Query");
    }
}
