/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_1_io1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch24_1 {

   
    public static void main(String[] args)throws Exception {
        Book b1 = new Book("B1","A0001");
        Student st1 = new Student("Ken",b1);
        File f = new File("c:\\mydir\\student.obj");
       try(ObjectOutputStream objOut = 
                new ObjectOutputStream(new FileOutputStream(f))){
          objOut.writeObject(st1);
       } 
    }
    
}
