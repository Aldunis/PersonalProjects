package com.company.Examples;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.*;

public class TestDAO {
    private  static Logger logger = LogManager.getLogger(TestDAO.class);
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";

    //  Database credentials
    static final String USER = "sa";
    static final String PASS = "";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // STEP 1: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 2: Open a connection
            logger.log(Level.INFO , "Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 3: Execute a query
            logger.log(Level.INFO ,"Creating statement in given table...");
            stmt = conn.createStatement();

            //INSERT METHOD
            String insert = "insert into BOOK.BOOK(NAME,YEAR ,AUTHOR,TYPE,PRICE) VALUES ('Morometii' , 1868 , 'Marin P','Book', 86)";
            stmt.executeUpdate(insert);
            logger.log(Level.INFO , "Created statement in given table...");

            //REMOVE METHOD
            String remove = "DELETE FROM BOOK.BOOK WHERE ID = 102";
            int succes = stmt.executeUpdate(remove);
            if (succes > 0)
                logger.log(Level.INFO , "Object succesfully deleted");
            else
                logger.log(Level.ERROR , "Object was not deleted");

            //UPDATE METHOD

            String update = "UPDATE BOOK.BOOK SET NAME = 'Eminescu' WHERE ID = 1";
            int succes1 = stmt.executeUpdate(update);
            if (succes1 > 0)
                logger.log(Level.INFO , "Object succesfully updated");
            else
                logger.log(Level.ERROR , "There was an error updating the object");

            //SELECT METHOD
            String select = "SELECT * FROM BOOK.BOOK WHERE ID = 1";
            ResultSet resultSet = stmt.executeQuery(select);
            if (resultSet.next()) {
                System.out.println("ID=" + resultSet.getString(1));
                System.out.println("Name=" + resultSet.getString(2));
                System.out.println("Year=" + resultSet.getString(3));
                System.out.println("Author=" + resultSet.getString(4));
                System.out.println("Type=" + resultSet.getString(5));
                System.out.println("Price=" + resultSet.getString(6));
            }
            else
                logger.log(Level.ERROR , "ID not found");



            // STEP 4: Clean-up environment
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            } // nothing we can do
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            } //end finally try
        } //end try
    }
}
