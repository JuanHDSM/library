package services;

import application.*;

import java.sql.*;

import java.util.*;

import db.*;

public class Update {
    public Update() {}

    public static void updateAuthor() {

        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement st = null;

        Read.allAuthor();

        System.out.println();
        System.out.print("Enter id author: ");
        int id = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the value update: ");
        String name = sc.nextLine();

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE author "
                            + "SET NAME = ?"
                            + "Where (Id) = ?");

            st.setString(1, name);
            st.setInt(2, id);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
            UI.clearScreen();
        } catch (InputMismatchException | SQLException e) {
            e.printStackTrace();
        }
    }
}
