package application;

import services.*;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Create create;

        System.out.println("1 - Create book");
        System.out.println("2 - Create author");
        int n = sc.nextInt();

        switch (n) {
            case 1 -> Create.createBook();
            case 2 -> Create.createAuthor();
        }
    }
}