package org.learn.designpatterns.creational.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
//        DatabaseFactory mySqlDatabaseFactory = DatabaseFactoryProducer.getFactory("MySQL");
//
//        Connection mysqlConnection = mySqlDatabaseFactory.createConnection();
//        Query mysqlQuery = mySqlDatabaseFactory.createQuery();
//        mysqlConnection.connect();
//        mysqlQuery.execute("SELECT * FROM users");
//
//        DatabaseFactory postgresDatabaseFactory = DatabaseFactoryProducer.getFactory("PostgreSQL");
//        Connection postgresConnection = postgresDatabaseFactory.createConnection();
//        Query postgresQuery = postgresDatabaseFactory.createQuery();
//        postgresConnection.connect();
//        postgresQuery.execute("SELECT * FROM employees");

    // Using cached factories
        DatabaseFactory cachedMySqlFactory = DatabaseFactoryProducer.getCachedFactory("MySQL");
        Connection cachedMysqlConnection = cachedMySqlFactory.createConnection();
        cachedMysqlConnection.connect();
        Query cachedMysqlQuery = cachedMySqlFactory.createQuery();
        cachedMysqlQuery.execute("SELECT * FROM users");

        DatabaseFactory cachedPostgresFactory = DatabaseFactoryProducer.getCachedFactory("PostgreSQL");
        Connection cachedPostgresConnection = cachedPostgresFactory.createConnection();
        cachedPostgresConnection.connect();

        DatabaseFactoryProducer.addNewDatabaseFactoryType("ORACLE", OracleDatabaseFactory::new);
        DatabaseFactory oracleFactory = DatabaseFactoryProducer.getCachedFactory("ORACLE");
        Connection oracleConnection = oracleFactory.createConnection();
        oracleConnection.connect();
        Query oracleQuery = oracleFactory.createQuery();
        oracleQuery.execute("SELECT * FROM departments");

    }
}
