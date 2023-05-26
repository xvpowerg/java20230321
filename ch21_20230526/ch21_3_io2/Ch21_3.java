/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20230526.ch21_3_io2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch21_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String fName= "netbeans-17-bin.zip";
       String tfName= "netbeans-17-bin_copy.zip";
       File src = new File("c:\\mydir\\"+fName);
       File targe = new File("c:\\mydir\\"+tfName);
       System.out.println(src.exists());
       
       try{
           BufferedInputStream fin = new BufferedInputStream(new FileInputStream(src)) ;
           BufferedOutputStream fout = new BufferedOutputStream (new FileOutputStream(targe));
           int data = -1;
           while((data = fin.read()) != -1){
               fout.write(data);
           }
           fout.close();
           fin.close();
       }catch(FileNotFoundException ex){
           System.out.println(ex);
       }catch(IOException ex){
           System.out.println(ex);
       }
       
    }
    
}
