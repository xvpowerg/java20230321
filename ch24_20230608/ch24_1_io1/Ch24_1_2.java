/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_1_io1;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author xvpow
 */
public class Ch24_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
         File f = new File("c:\\mydir\\student.obj");
         
        try(ObjectInputStream objIn = 
                 new ObjectInputStream(new FileInputStream(f))){
                Student st = (Student) objIn.readObject();
                System.out.println(st);
        }
    }
    
}
