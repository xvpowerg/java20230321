/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_4_nio2_4;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 = Paths.get("c:","mydir");
      System.out.println(p1.isAbsolute());
       System.out.println(p1.toAbsolutePath());
     Path p2 = Paths.get("..","value","mydir"); 
     System.out.println(p2.isAbsolute());
      System.out.println(p2.toAbsolutePath());
    }
    
}
