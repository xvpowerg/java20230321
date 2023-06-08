/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_6_nio2_6;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch24_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Path p1 = Paths.get("c:","mydir","dir","dir1");
     Path p2 = Paths.get("c:", "mydir");
     System.out.println(p1.relativize(p2));
     
     Path p3 = Paths.get("c:", "mydir");
     Path p4 = Paths.get("d:", "myfile");
     System.out.println(p3.relativize(p4));//'other' has different root
    }
    
}
