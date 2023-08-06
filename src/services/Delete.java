package services;

import java.sql.*;

import java.util.*;

import db.*;

public class Delete {
    public Delete(){}

    public static void deleteAuthor() {

        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement st = null;

        Read.allAuthor();

        System.out.println();
        System.out.print("Enter id author: ");
        int id = sc.nextInt();


        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM author "
                            + "WHERE Id = ?");

            st.setInt(1, id);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Id = " + id + " was deleted!");
        } catch (SQLException e) {
            throw new DbIntegrityException("Autor não pode ser deletado! Faz referência a um tipo livro.");
        }
    }

    public static void deleteBook () {

        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement st = null;

        Read.allBooks();

        System.out.println();
        System.out.print("Enter id author: ");
        int id = sc.nextInt();


        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "DELETE FROM book "
                            + "WHERE Id = ?");

            st.setInt(1, id);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Id = " + id + " was deleted!");
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
    }
}
