/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20230608.ch24_2_io2;
import java.time.LocalDateTime;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Ch24_2 {

    public static void main(String[] args)throws Exception {
         LocalDateTime dateTime =  LocalDateTime.now();
        User user =  new User("Ken",dateTime.toString());
        System.out.println(user);
        File f1 = new File("c:\\mydir\\user.obj");
        try(FileOutputStream fOut = new FileOutputStream(f1);
            ObjectOutputStream outObj = new ObjectOutputStream(fOut);){
            outObj.writeObject(user);
        }
        
    }
    
}
