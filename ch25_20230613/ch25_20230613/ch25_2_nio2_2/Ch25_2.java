/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230613.ch25_2_nio2_2;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author xvpow
 */
public class Ch25_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        ArrayList <String> list = new ArrayList();
        list.add("Ken");
        list.add("Iris");
        list.add("Joy");
        Path p1 = Paths.get("c:","mydir","mylist.obj");
        try (ObjectOutputStream objOut =
                new ObjectOutputStream(Files.newOutputStream(p1));){
            objOut.writeObject(list);
        }
        
        try(ObjectInputStream objIn = 
                new ObjectInputStream(Files.newInputStream(p1))){
           System.out.println(objIn.readObject());
        }
        
    }
    
}
