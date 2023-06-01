/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230601.Ch22_2_io1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Ch22_2 {
    public static void main(String[] args)  {
        // TODO code application logic here
        File src = new File("c:\\mydir\\msg.txt");
        File target = new File("c:\\mydir\\msg_copy.txt");
        //System.out.println(src.exists());
        try{
            FileInputStream fin = new FileInputStream(src);
            FileOutputStream fOut = new FileOutputStream(target);
            int data = -1;
            while((data = fin.read()) != -1){
                //System.out.println(data);
                fOut.write(data);
            }
        }catch(FileNotFoundException ex){
               System.out.println(ex);
        } catch (IOException ex) {
            
        }
        
    }
    
}
