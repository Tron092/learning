package org.learn.designpatterns.creational.abstractfactory;

public class PostgresDatabaseFactory implements DatabaseFactory {
    public PostgresDatabaseFactory() {
        System.out.println("PostgresDatabaseFactory initialized.");
    }
    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }

    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }
}
