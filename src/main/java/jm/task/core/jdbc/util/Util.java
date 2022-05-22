package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    private static String URL = "jdbc:mysql://localhost:3306/test";
    private static String USER = "root";
    private static String PASS = "nekomunedam";


    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASS);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }


}
