package aqa.core.lesson6.yumykhalchuk;
/*
implement object Book from Homework 6.xlsx
The object must have:
2-3 fields
2-3 constructors
override toString() method
override equals() method
override hashCode() method
!!! All of these methods must use declared fields
Also, implement at least one child with :
one inherited method
one overrided method
one specific method
*/

import java.util.Objects;

public class Book {
    public String title;
    public String author;
    public String genre;
    public double price;
    public int amountOfPages;


    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String title, double price){
        this.title = title;
        this.price = price;
    }
    public Book(String genre){
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(String title, String author, double price, int amountOfPages){
        this.title = title;
        this.author = author;
        this.price = price;
        this.amountOfPages = amountOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void printGenre(){
        System.out.print(" " + "The genre of my favourite book is: "+ genre);

    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", amountOfPages=" + amountOfPages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return price == book.price &&
                amountOfPages == book.amountOfPages &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, amountOfPages);
    }
}
