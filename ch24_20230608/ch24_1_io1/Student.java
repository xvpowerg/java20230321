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
public class Student implements Serializable {
    private String name;
    private transient Book book;

    public Student(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", book=" + book + '}';
    }
    
    
    
    
}
