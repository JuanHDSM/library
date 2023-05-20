package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Adress;
import entities.Book;
import entities.User;
import services.RentalBookService;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        User userData = new User(1, "Lana", new Adress("Zumbi dos Palmares", "Manduri", 94, 69084060));

        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        Book book = new Book("Jogos Vorazes", "Suzanne Collins", "Rocco", 2008);

        RentalBookService rentalBookService = new RentalBookService(80.0, start, finish, userData, book);

        System.out.println("Nome do Livro: " + book.getBookName() + ", author: " + book.getAuthor() + ", publishing year : " + book.getReleaseYear());
        System.out.println("Fatura: ");
        System.out.println("Preço do aluguel: R$" + rentalBookService.getRentalPrice());

        sc.close();
    }
}
