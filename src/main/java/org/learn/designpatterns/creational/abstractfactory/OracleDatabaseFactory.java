package org.learn.designpatterns.creational.abstractfactory;

public class OracleDatabaseFactory implements DatabaseFactory {
    public OracleDatabaseFactory() {
        System.out.println("Oracle Database Factory created.");
    }
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Query createQuery() {
        return new OracleQuery();
    }
}
