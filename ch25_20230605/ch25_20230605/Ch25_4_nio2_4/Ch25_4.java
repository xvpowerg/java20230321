/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230605.Ch25_4_nio2_4;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
public class Ch25_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Path p1 = Paths.get("c:", "mydir");
      try{
        Stream<Path>  listp =  Files.list(p1);
        //listp.forEach(v->System.out.println(v));
       List<Path>  pathList = listp.filter(p->p.toString().contains(".txt")).
                collect(Collectors.toList());
       System.out.println(pathList);
      }catch(IOException ex){
         System.out.println(ex);
      }
    }
    
}
