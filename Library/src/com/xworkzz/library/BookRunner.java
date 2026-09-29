package com.xworkzz.library;

import com.xworkzz.library.book.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);
//        book.bookId =1;
//        book.bookName = "Verity";
//        book.price = 349.00;
//        book.author = "Cooleen hoover";
//        book.publisher = "Little, Brown";

        book.setBookId(5);
        int bookId= book.getBookId();
        System.out.println("Book Id : "+ bookId);

        book.setBookName("verity");
        String bookName = book.getBookName();
        System.out.println("Book name : "+bookName);

        book.setPrice(349);
        double price = book.getPrice();
        System.out.println("Price : "+price);

        book.setAuthor("Cooleen hoover");
        String author = book.getAuthor();
        System.out.println("Author : "+author);

        book.setPublisher("Little, Brown");
        String publisher = book.getPublisher();
        System.out.println("publisher : "+ publisher);

//        Book book1 = new Book();
//        book1.bookId =1;
//        book1.bookName = "Verity";
//        book1.price = 349.00;
//        book1.author = "Cooleen hoover";
//        book1.publisher = "Little, Brown";
//
//        System.out.println("using == operator ");
//        System.out.println(book == book1);
//
//        boolean isEqual = book.equals(book1);
//        System.out.println("using equals method");
//        System.out.println(isEqual);
//        System.out.println(book.equals(book1));

    }
}
