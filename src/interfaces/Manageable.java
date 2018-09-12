/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Book;
import entity.LibHistory;
import entity.Reader;
import java.util.List;

/**
 *
 * @author st0lu
 */
public interface Manageable {
    public Book createBook();
    public Reader createReader();
    public LibHistory issueBook(List<Book> books, List<Reader> readers);
    public boolean returnBook(List<LibHistory> libHistories);
    public void returnHistory(List<LibHistory> libHistories);
    
}
