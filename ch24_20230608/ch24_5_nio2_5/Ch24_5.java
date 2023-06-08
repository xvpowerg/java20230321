/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_5_nio2_5;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 =   Paths.get("c:", "mydir");
      Path p2 =   Paths.get( "msg.txt");
      System.out.println(p1.resolve(p2));
      
      Path p3 = Paths.get("c:","mydir");
      Path p4 = Paths.get("c:","myFile","msg.txt");
      System.out.println(p3.resolve(p4));
      
      Path p5 = Paths.get("c:","a","b","c");
       Path p6 = Paths.get("myImage.jpg");
      System.out.println(p5.resolveSibling(p6));
      
      
    }
    
}
