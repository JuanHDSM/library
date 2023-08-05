package services;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.*;

public class Read {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

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
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
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
                System.out.println(rs.getInt("Id")
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
        }
        finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
