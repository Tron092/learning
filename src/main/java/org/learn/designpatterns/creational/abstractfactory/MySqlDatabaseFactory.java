package org.learn.designpatterns.creational.abstractfactory;

public class MySqlDatabaseFactory implements DatabaseFactory {
    public MySqlDatabaseFactory(){
        System.out.println("MySqlDatabaseFactory instance created.");
    }
    @Override
    public Connection createConnection() {
        return new MySqlConnection();
    }

    @Override
    public Query createQuery() {
        return new MysqlQuery();
    }
}
