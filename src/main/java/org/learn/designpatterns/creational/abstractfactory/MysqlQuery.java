package org.learn.designpatterns.creational.abstractfactory;

public class MysqlQuery implements Query {
    @Override
    public void execute(String sql) {
        System.out.println("Executing MySQL Query");
    }
}
