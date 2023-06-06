/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230606.Ch23_5_io5;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_5_2 {
    public static void main(String[] args) throws Exception{
        File file = new File("c:\\mydir\\list.obj");
        
        try(ObjectInputStream objIn = 
                new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
          ArrayList list =   (ArrayList)objIn.readObject();
          System.out.print(list.size());
        }
    }
    
}
