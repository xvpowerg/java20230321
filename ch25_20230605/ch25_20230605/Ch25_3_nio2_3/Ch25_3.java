/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230605.Ch25_3_nio2_3;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch25_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      list.add("Ken");
      list.add("Vivin");
      list.add("Lucy");
      Path p1 = Paths.get("c:", "mydir","mylist.obj");
      try(ObjectOutputStream objOut = 
              new ObjectOutputStream(Files.newOutputStream(p1))){
          objOut.writeObject(list);
      }catch(IOException ex){
          System.out.println(ex);
      }
    }
    
}
