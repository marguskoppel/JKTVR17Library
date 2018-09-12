/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author st0lu
 */
public class BookCreator {
    public Book returnNewBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************BOOK ADDING*****************");
        Book book = new Book();
        System.out.println("NAME of the book: ");
        book.setBookName(scanner.nextLine());
        System.out.println("ISBN of the book: ");
        book.setIsbn(scanner.nextLine());
        System.out.println("AUTHOR of the book: ");
        book.setAuthor(scanner.nextLine());
        System.out.println("YEAR of PUBLISHING of the book: ");
        book.setYearPublishing(scanner.nextInt());
        return book;
    }
}
