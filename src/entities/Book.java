package entities;

import java.util.Date;

public class Book {
    private String name;
    private Date releaseYear;
    private String sinopse;
    private Integer authorId;

    public Book(String name, Date releaseYear, String sinopse, Integer authorId) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.sinopse = sinopse;
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }
}
