/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230606.Ch23_4_io4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch23_4 {
    public static void main(String[] args) {
        //序列化
        String name = "Ken";
        File fi1e = new File("c:\\mydir\\name.obj");
        try(ObjectOutputStream obj = 
                new ObjectOutputStream(new FileOutputStream(fi1e))){
            obj.writeObject(name);
        }catch(IOException ex){
            System.out.println(ex);
        }
       
    }
    
}
