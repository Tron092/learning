package org.learn.designpatterns.creational.abstractfactory;

public class PostgresDatabaseFactory implements DatabaseFactory {
    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }

    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }
}
