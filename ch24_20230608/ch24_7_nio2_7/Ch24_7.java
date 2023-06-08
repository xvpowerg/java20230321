/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_7_nio2_7;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 =  Paths.get("/home",".","mydir","test");
      System.out.println(p1.normalize());
      Path p3 = Paths.get("home", "music","..","images","photo.jpg");
      System.out.println(p3.normalize());
        
    }
    
}
