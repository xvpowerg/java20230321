/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230605.Ch25_5_nio2_5;

/**
 *
 * @author xvpow
 */
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
public class Ch25_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
      Path p1 = Paths.get("c:", "mydir","dir");
      Stream<Path> st  = Files.list(p1);
      st.forEach(v->System.out.println(v));
      System.out.println("===========================");
     Stream<Path>  stp = Files.walk(p1,2);
      stp.forEach(p->System.out.println(p));
    }
    
}
