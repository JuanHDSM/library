package services;

import java.sql.*;

import java.text.*;

import java.util.*;

import db.*;


public class Create {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy", Locale.FRENCH);

    public Create() {}

    public static void createAuthor() {

        Connection conn = null;
        PreparedStatement st = null;
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter author name: ");
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

    public static void createBook() throws ParseException {
        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement st = null;

        System.out.println("Enter data book:");
        System.out.print("Book name: ");
        String name = sc.nextLine();
        System.out.print("Release year: ");
        String releaseYear = sc.next();
        sc.nextLine();
        System.out.print("Sinopse: ");
        String sinopse = sc.nextLine();
        System.out.print("Author id: ");
        int AuthorId = sc.nextInt();


        try{
            conn = DB.getConnection();
            st = conn.prepareStatement("INSERT INTO book" +
                    " (Name, ReleaseYear, Sinopse, AuthorId) " +
                    "VALUES " +
                    "(?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            st.setString(1, name);
            st.setDate(2, new java.sql.Date(sdf.parse(releaseYear).getTime()));
            st.setString(3, sinopse);
            st.setInt(4, AuthorId);
            st.executeUpdate();

        } catch (ParseException | SQLException e) {
            throw new DbException(e.getMessage());
        }

    }

}
