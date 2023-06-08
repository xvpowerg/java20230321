/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_9_nio2_9;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardCopyOption;
/**
 *
 * @author xvpow
 */
public class Ch24_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Path src = Paths.get("c:","mydir","netbeans-17-bin.zip");
      Path target = Paths.get("c:","mydir","netbeans-17-bin-copy.zip");
        try{
            Files.copy(src, target,StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException ex){
            System.out.println(ex);
        }*/
      
//      Path src = Paths.get("c:","mydir","netbeans-17-bin-copy.zip");
//      Path target = Paths.get("c:","mydir","dir","netbeans-17-bin-copy.zip");  
//        try{
//             Files.move(src, target, StandardCopyOption.REPLACE_EXISTING,
//             StandardCopyOption.ATOMIC_MOVE);
//        }catch(IOException ex){
//            System.out.println(ex);
//        }
//    
      //chnage name  
      Path src = Paths.get("c:","mydir","netbeans-17-bin-copy.zip");
      Path target = Paths.get("c:","mydir","netbeans-17-bin-copy2.zip");  
        try{
             Files.move(src, target, StandardCopyOption.REPLACE_EXISTING,
             StandardCopyOption.ATOMIC_MOVE);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
