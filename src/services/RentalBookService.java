package services;

import java.time.LocalDateTime;

import entities.Book;
import entities.User;

public class RentalBookService {
     
    private Double rentalPrice;
    private LocalDateTime start;
    private LocalDateTime finish;
    private User user;
    private Book book;

    public RentalBookService() {
    }

    public RentalBookService(Double rentalPrice, LocalDateTime start, LocalDateTime finish, User user, Book book) {
        this.rentalPrice = rentalPrice;
        this.start = start;
        this.finish = finish;
        this.user = user;
        this.book = book;
    }

    public Double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
}