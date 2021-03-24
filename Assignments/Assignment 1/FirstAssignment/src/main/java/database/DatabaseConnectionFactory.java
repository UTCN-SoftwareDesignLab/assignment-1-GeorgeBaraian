package database;

import static database.Constants.Schemas.PRODUCTION;

public class DatabaseConnectionFactory{

    public static JDBConnectionWrapper getConnectionWrapper(){
        return new JDBConnectionWrapper(PRODUCTION);
    }
}