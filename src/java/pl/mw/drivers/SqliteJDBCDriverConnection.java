package pl.mw.drivers;

import pl.mw.model.Person;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

public class SqliteJDBCDriverConnection {
    Connection conn = null;
    Statement stmt = null;

    public SqliteJDBCDriverConnection() throws ClassNotFoundException {
        try {
            Class.forName("org.sqlite.JDBC");

            String url = "jdbc:sqlite:\\sqlite\\peopleDatabase.db";
            conn = DriverManager.getConnection(url);

            System.out.println("Połączenie do SQLite zestawione");
            //  conn.close();
        } catch (SQLException e) {
            System.out.println("moje " + e.getMessage());
        }
    }

    public ArrayList<Person> listPersons() {
        ArrayList<String> wynik = new ArrayList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();
        try {
            this.stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM people");
            while (rs.next()) {
                String name = rs.getString("Name");
                String surname = rs.getString("Surname");
                int bornYear = rs.getInt("BornYear");
                int phone = rs.getInt("Phone");
                String sex = rs.getString("Sex");
                personArrayList.add(new Person(name, surname, bornYear, phone, sex));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personArrayList;
    }

    public void insertDataToSQLite(String query) {
        try {
            this.stmt = conn.createStatement();
            int in = stmt.executeUpdate(query);
            System.out.println("Dodano do bazy " + in + " rekord");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public void closeConnection() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
