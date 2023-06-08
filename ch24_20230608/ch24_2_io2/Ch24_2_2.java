/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_2_io2;
import java.io.File;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
/**
 *
 * @author xvpow
 */
public class Ch24_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File f1 = new File("c:\\mydir\\user.obj");
     try(ObjectInputStream objin = new
         ObjectInputStream(new FileInputStream(f1));){
        User user = (User) objin.readObject();
        System.out.println(user);
     }
        
        
    }
    
}
