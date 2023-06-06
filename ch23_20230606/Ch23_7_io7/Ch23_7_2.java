/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230606.Ch23_7_io7;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author xvpow
 */
public class Ch23_7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
       File file = new File("c:\\mydir\\item.obj");
       try(ObjectInputStream objIn = 
               new ObjectInputStream(new FileInputStream(file)) ){
         Item it = (Item)  objIn.readObject();
         System.out.println(it);
       }
    }
    
}
