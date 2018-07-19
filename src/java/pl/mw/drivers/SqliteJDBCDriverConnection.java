package pl.mw.drivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
public class SqliteJDBCDriverConnection {

    public static void connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:../resource/peopleDatabase.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Połączenie do SQLite zestawione");
        } catch (SQLException e) {
            System.out.println("moje "+e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("moje2 "+ex.getMessage());
            }
        }
    }
}
