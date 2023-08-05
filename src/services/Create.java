package services;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import db.*;

public class Create {



    public Create(String name) {
        createAuthor();
    }

    public static void createAuthor() {

        Connection conn = null;
        PreparedStatement st = null;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter author name: ");
        String name = sc.nextLine();

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement("INSERT INTO author (Name) VALUES (?)");
            st.setString(1, name);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }


}
