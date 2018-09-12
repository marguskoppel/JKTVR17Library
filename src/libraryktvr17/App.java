/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryktvr17;

import classes.BookCreator;
import classes.BookReturner;
import classes.HistoryReturner;
import classes.LibHistoryCreator;
import classes.ReaderCreator;
import entity.Book;
import entity.LibHistory;
import entity.Reader;
import interfaces.Manageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author st0lu
 */
public class App {

    private List<Book> books = new ArrayList<>();
    private List<Reader> readers = new ArrayList<>();
    private List<LibHistory> libHistories = new ArrayList<>();
    private Manageable manager = new ConsoleInterface();

    public void run() {
        String repeat = "r";
        Scanner scanner = new Scanner(System.in);
        int task;
        do {
            System.out.println("WELCOME TO THE LIBRARY");
            System.out.println("0 - EXIT");
            System.out.println("1 - Add Book");
            System.out.println("2 - Add Reader");
            System.out.println("3 - Give out book to the reader");
            System.out.println("4 - Return Book");
            System.out.println("5 - Library's history");

            task = scanner.nextInt();
            switch (task) {
                case 0:
                    repeat = "s";
                    break;
                case 1:

                    books.add(manager.createBook());
                    break;
                case 2:

                    readers.add(manager.createReader());
                    break;
                case 3:

                    libHistories.add(manager.issueBook(books, readers));
                    break;
                case 4:

                    if (manager.returnBook(libHistories)) {
                        System.out.println("Book returned");

                    } else {
                        System.out.println("Could not return the book");
                    }
                    break;
                case 5:

                    manager.returnHistory(libHistories);
                    break;
                default:
                    System.out.println("Выберите одно из действий!");

            }

        } while ("r".equals(repeat));

    }

}
