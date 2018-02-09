package com.example.demo;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Book {



    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=4)
    private String title;

   @NotNull
   @NotEmpty
    private String author;


   @NotNull
   @NotEmpty
   private String year;

  @NotNull
   @NotEmpty
   private String isbn;

  @NotNull
   @NotEmpty
   private String image;
    @NotNull
    @NotEmpty
    private String bookinfo;

    public Book() {
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Book(String title, String author, String year, String isbn, String image, String bookinfo) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.image = image;
        this.bookinfo = bookinfo;
    }

    public String getBookinfo() {
        return bookinfo;
    }

    public void setBookinfo(String bookinfo) {
        this.bookinfo = bookinfo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



   public String getIsbn() {
       return isbn;
   }

   public void setIsbn(String isbn) {
       this.isbn = isbn;
    }

    public String getImage() {
       return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
