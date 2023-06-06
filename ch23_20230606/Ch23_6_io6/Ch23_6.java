/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230606.Ch23_6_io6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ch23_6 {
    public static void main(String[] args)throws Exception {
        Item i1 = new Item("A1",25);
        File file = new File("c:\\mydir\\item.obj");
        try(ObjectOutputStream objOut =
                new ObjectOutputStream(new FileOutputStream(file))){
            objOut.writeObject(i1);
        }
        
    }
    
}
