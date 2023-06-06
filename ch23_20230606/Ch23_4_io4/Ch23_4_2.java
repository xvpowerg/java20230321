/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230606.Ch23_4_io4;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_4_2 {

    /**
     * @param args the command line arguments
     */ //反序列化
    public static void main(String[] args) {
      File fi1e = new File("c:\\mydir\\name.obj");
      try(FileInputStream fin = new FileInputStream(fi1e);
          ObjectInputStream objIn = new  ObjectInputStream(fin);   
              ){
       String name =  objIn.readObject().toString();
       System.out.println(name);
      }catch(IOException | ClassNotFoundException ex){
          System.out.println(ex);
      }
        
    }
    
}
