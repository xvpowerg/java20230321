/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230605.Ch25_1_nio2_1;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch25_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
      Path p1 = Paths.get("c:", "mydir","msg.txt");
       boolean exists =  Files.exists(p1);
        System.out.println(exists);
        if (exists){
          Files.delete(p1);
        }
        Files.deleteIfExists(p1);
    }
    
}
