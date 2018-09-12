/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.LibHistory;
import entity.Reader;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author st0lu
 */
public class LibHistoryCreator {

    public LibHistory returnNewLibHistory(List<Book> books, List<Reader> readers) {
        System.out.println("Giving Book to the Reader");
        Scanner scanner = new Scanner(System.in);
        System.out.println("List of the BOOKS: ");
        int countBooks = books.size();
        for (int i = 0; i < countBooks; i++) {
            System.out.println(i + 1 + ". " + books.get(i).getBookName());
        }
        System.out.println("List of the READERS: ");
        int countReaders = readers.size();
        for (int i = 0; i < countReaders; i++) {
            System.out.println(i + 1 + ". " + readers.get(i).getName() + " " + readers.get(i).getSurname());
        }
        System.out.println("Choose BOOK's number");
        int numberBook = scanner.nextInt();
        Book book = books.get(numberBook-1);
        System.out.println("Choose READER's number");
        int numberReader = scanner.nextInt();
        Reader reader = readers.get(numberReader-1);
        Calendar c = new GregorianCalendar();
        LibHistory libHistory = new LibHistory(null, book, reader, c.getTime(), null);
        return libHistory;
    }
}
