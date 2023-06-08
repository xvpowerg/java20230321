/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_3_nio2_3;
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
     Path p1 =  Paths.get("c:","mydir","msg.txt");
     System.out.println(p1);
     System.out.println(p1.endsWith("msg.txt"));
      System.out.println(p1.getFileSystem());
      System.out.println(p1.getFileName());
     Path p2 =  Paths.get("c:","A","B","C","D");
     System.out.println(p2.getRoot());
     System.out.println(p2.subpath(0, 3));
     System.out.println(p2.getNameCount());
     System.out.println(p2.getName(1));
     Path p3 =  Paths.get("c","A","B","C","D");
     System.out.println(p3.getRoot());
     System.out.println(p3.subpath(0, 3));
     System.out.println(p3.getName(0));
    }
    
}
