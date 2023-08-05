package application;

import services.*;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Create book");
        System.out.println("2 - Create author");
        System.out.println("3 - Find books");
        System.out.println("3 - Find authors");
        System.out.print("Enter choice: ");
        int n = sc.nextInt();

        System.out.println();
        switch (n) {
            case 1 -> Create.createBook();
            case 2 -> Create.createAuthor();
            case 3 -> Read.allBooks();
            case 4 -> Read.allAuthor();
        }
    }
}