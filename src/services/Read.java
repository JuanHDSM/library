package services;

import application.*;

import java.sql.*;

import db.*;

public class Read {

    public Read() {};

    public static void allAuthor() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from author");

            while (rs.next()) {
                System.out.println(rs.getInt("Id") + ", " + rs.getString("NAME"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            throw new DbException(e.getMessage());
        }
        finally {
            UI.clearScreen();
        }
    }

    public static void allBooks(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {

            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from book");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("Id")
                        + ", "
                        + rs.getString("Name")
                        + ", "
                        + rs.getString("ReleaseYear")
                        + ", "
                        + rs.getString("Sinopse")
                        + ", "
                        + rs.getInt("AuthorId")
                );
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            throw new DbException(e.getMessage());
        } finally {
            UI.clearScreen();
        }
    }
}
