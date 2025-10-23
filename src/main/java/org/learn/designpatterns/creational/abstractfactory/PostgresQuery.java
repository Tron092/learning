package org.learn.designpatterns.creational.abstractfactory;

public class PostgresQuery implements Query {
    @Override
    public void execute(String sql) {
        System.out.println("Executing PostgreSQL Query");
    }
}
