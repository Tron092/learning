package org.learn.designpatterns.creational.abstractfactory;

public class DatabaseFactoryProducer {
    public static DatabaseFactory getFactory(String dbType) {
        if (dbType.equalsIgnoreCase("MYSQL")) {
            return new MySqlDatabaseFactory();
        } else if (dbType.equalsIgnoreCase("POSTGRESQL")) {
            return new PostgresDatabaseFactory();
        }
        return null;
    }
}
