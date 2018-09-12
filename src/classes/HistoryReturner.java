/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.LibHistory;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author st0lu
 */
public class HistoryReturner {
    public void printListWhoTookBooks(List<LibHistory> libHistories){
        System.out.println("******************List of Readers who took books**************");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int countHistories = libHistories.size();
        for (int i = 0; i < countHistories; i++) {
            LibHistory h = libHistories.get(i);
            if(h.getBookReturn()==null){
                System.out.println(i+1+". "+h.getBook().getBookName()+
                        ". is reading: "+h.getReader().getName()+
                        " "+h.getReader().getSurname()+
                        ". Date: "+sdfDate.format(h.getBookIssued()));
            
            }
            
        }
    
    }
}
