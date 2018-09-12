/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author st0lu
 */
public class ReaderCreator {
     public Reader returnNewReader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************READER ADDING*****************");
        Reader reader = new Reader();
        System.out.println("ID of the reader: ");
        reader.setId(scanner.nextLong());
        System.out.println("NAME of the reader: ");
        reader.setName(scanner.nextLine());
        System.out.println("SURNAME of the reader: ");
        reader.setSurname(scanner.nextLine());
        System.out.println("PHONE of the reader: ");
        reader.setPhone(scanner.nextLine());
        System.out.println("CITY of the reader: ");
        reader.setCity(scanner.nextLine());
        return reader;
    }
}
