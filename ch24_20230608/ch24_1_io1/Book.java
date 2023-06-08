/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20230608.ch24_1_io1;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Book {
    private String name;
    private String isbn;

    public Book(String name, String isbn) {
        this.name = name;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", isbn=" + isbn + '}';
    }
    
           
}
