/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_8_nio2_8;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Path p1 = Paths.get("c:", "mydir");
      boolean isExists =  Files.exists(p1);
        System.out.println(isExists);
       Path delP = Paths.get("c:","mydir","delete.txt");
       try{
           //Files.delete(delP);
           boolean b1 = Files.deleteIfExists(delP);
           System.out.println(b1);
       }catch(IOException ex){
           System.out.println(ex);
       }
    }
    
}
