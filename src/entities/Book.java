package entities;

public class Book {
    
    private String bookName;
    private String author;
    private String publishingCompany;
    private Integer releaseYear;

    public Book() {
    }

    public Book(String bookName, String author, String publishingCompany, Integer releaseYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.releaseYear = releaseYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

}
