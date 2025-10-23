package org.learn.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DatabaseFactoryProducer {
    public static DatabaseFactory getFactory(String dbType) {
        if (dbType.equalsIgnoreCase("MYSQL")) {
            return new MySqlDatabaseFactory();
        } else if (dbType.equalsIgnoreCase("POSTGRESQL")) {
            return new PostgresDatabaseFactory();
        }
        return null;
    }

    private static Map<String, Supplier<DatabaseFactory>> factoryCache  = new HashMap<>();

    static {
        factoryCache.put("MYSQL", MySqlDatabaseFactory::new);
        factoryCache.put("POSTGRESQL", PostgresDatabaseFactory::new);
    }

    public static DatabaseFactory getCachedFactory(String dbType) {
        Supplier<DatabaseFactory> databaseFactory = factoryCache.get(dbType.toUpperCase());
        if(databaseFactory != null) {
            return databaseFactory.get();
        }
        throw new IllegalArgumentException("Unknown database type: " + dbType);
    }

    public static String addNewDatabaseFactoryType(String dbType, Supplier<DatabaseFactory> databaseFactory) {
        if (dbType == null || dbType.isEmpty() || databaseFactory == null) {
            throw new RuntimeException("Database type and instance cannot be null or empty");
        }
        factoryCache.put(dbType.toUpperCase(), databaseFactory);
        return "Database factory type " + dbType + " added successfully.";
    }
}
