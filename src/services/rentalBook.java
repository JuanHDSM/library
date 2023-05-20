package services;

import entities.Book;
import entities.User;

public class rentalBook {
     
    private Double rentalPrice;
    private User user;
    private Book book;

    public rentalBook() {
    }

    public rentalBook(Double rentalPrice, User user, Book book) {
        this.rentalPrice = rentalPrice;
        this.user = user;
        this.book = book;
    }

    public Double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Double rentalPrice) {
        this.rentalPrice = rentalPrice;
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
