package com.xworkzz.library.book;

public class Book {

    private int bookId;
    private String bookName;
    private double price;
    private String author;
    private String publisher;


    public int getBookId(){
        return bookId;
    }

    public String getBookName(){
        return bookName;
    }

    public double getPrice(){
        return price;
    }
    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public void setBookId(int bookId){
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public  boolean equals(Object obj){

        Book book = (Book) obj; //down casting to compare states of book class (Child class)

        if(this.bookId == book.bookId && this.bookName.equals(book.bookName)
                && this.author.equals(book.author)
        && this.price == book.price && this.publisher.equals(book.publisher)){
            return true;
        }

        return false;
    }
}
