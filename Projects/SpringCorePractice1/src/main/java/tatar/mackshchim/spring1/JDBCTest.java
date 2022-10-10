package tatar.mackshchim.spring1;

import java.sql.*;

public class JDBCTest {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/test";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "postgres";
    private static final String DB_DRIVER = "org.postgresql.Driver";

    private static Connection connection;
    private static Statement statement;

    private static boolean getDBConnection() {


        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try {
            connection = DriverManager.getConnection(
                    DB_URL,
                    DB_USERNAME,
                    DB_PASSWORD);
            statement = connection.createStatement();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean putUser(String username, String password, Integer id) {
        String sqlreq = "INSERT INTO \"Users\" (Username, Password) VALUES ('" + username
                + "', '" + password + "'";
        if (id == null)
            sqlreq+= ");";
        else
            sqlreq+= ", 'id' = '" + id + "');";
        try {
            statement.execute(sqlreq);
            return true;
        } catch (SQLException e) {
            e.getMessage();
            return false;
        }
    }

    public static String getUsernameByID(Integer id) throws SQLException {
        String sqlreq = "SELECT * FROM \"Users\" WHERE id = '" + id + "';";
        //statement = connection.createStatement();
        statement.execute(sqlreq);

        ResultSet resultSet = statement.executeQuery(sqlreq);
        resultSet.next();
        return resultSet.getString("Username");
    }


    public static void main(String[] args) throws SQLException{
        getDBConnection();
        putUser("alex","huyaleks",null);
        putUser("lexa","lepexa",null);
        System.out.println(getUsernameByID(1));
    }


}
