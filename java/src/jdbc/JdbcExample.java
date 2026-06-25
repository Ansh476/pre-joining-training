package jdbc;

import java.sql.*;

public class JdbcExample {

    static final String DB_URL ="jdbc:mysql://localhost:3306/college_db";

    static final String USER = "root";
    static final String PASS = "admin";

    public static void main(String[] args) {

        try (
                Connection conn =DriverManager.getConnection(DB_URL,USER,PASS);

                Statement stmt =conn.createStatement()
        ) {

            //insert
            stmt.executeUpdate("INSERT INTO students VALUES (1,'Ansh',22,'VESIT')");
            stmt.executeUpdate("INSERT INTO students VALUES (2,'Rakshit',23,'VESIT')");

            System.out.println("data inserted");

            // select
            System.out.println("\nstudent records");
            ResultSet rs =stmt.executeQuery("SELECT * FROM students");

            while(rs.next()) {
                System.out.println(rs.getInt("id")+ " "+ rs.getString("name")+ " "+ rs.getInt("age")+ " "+ rs.getString("college"));
            }
            
            // update
            stmt.executeUpdate("UPDATE students SET age = 23  WHERE id = 1");
            System.out.println("\ndata updated");

            // delete
            stmt.executeUpdate("DELETE FROM students WHERE id = 2");
            System.out.println("deleted data");

            // select for updated data
            System.out.println("\nfinal records");
            rs = stmt.executeQuery("SELECT * FROM students");

            while(rs.next()) {
                System.out.println(rs.getInt("id")+ " "+ rs.getString("name")+ " "+ rs.getInt("age")+ " "+ rs.getString("college"));
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}