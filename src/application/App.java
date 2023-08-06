package application;

import services.*;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = 1;
        try {
            while (n != 0) {
                System.out.println();
                System.out.println("1 - Add book");
                System.out.println("2 - Add author");
                System.out.println("3 - Find books");
                System.out.println("4 - Find authors");
                System.out.println("5 - Delete book");
                System.out.println("6 - Delete author");
                System.out.println("7 - Update author");

                System.out.println();
                System.out.print("Enter choice: ");
                n = sc.nextInt();

                switch (n) {
                    case 1 -> Create.createBook();
                    case 2 -> Create.createAuthor();
                    case 3 -> Read.allBooks();
                    case 4 -> Read.allAuthor();
                    case 5 -> Delete.deleteBook();
                    case 6 -> Delete.deleteAuthor();
                    case 7 -> Update.updateAuthor();
                    default -> System.out.println("Opção " + n + " não encontrada! Escolha uma opção válida!");
                }
                UI.clearScreen();
            }
        } catch (InputMismatchException e) {
            System.out.println("Entre com um número inteiro!");
        }
    }
}