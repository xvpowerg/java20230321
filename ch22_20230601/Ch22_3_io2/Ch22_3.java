/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230601.Ch22_3_io2;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ch22_3 {
    public static void main(String[] args) {
        File src = new File("c:\\mydir\\netbeans-17-bin.zip");
        File target = new File("c:\\mydir\\netbeans-17-bin-copy.zip");
       try{
           BufferedInputStream fin = new BufferedInputStream(new FileInputStream(src));
           BufferedOutputStream fOut = new BufferedOutputStream(new FileOutputStream(target));
           int data = -1;
           while( (data = fin.read()) != -1){
                fOut.write(data);
           }
           fOut.close();
           fin.close();
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
    
}
