/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20230526.ch21_2_io1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "mymsg.txt";
        String copyfileName = "mymsg_copy.txt";
        File f1 = new File("c:\\mydir\\"+fileName);
        File target = new File("c:\\mydir\\"+copyfileName);
        System.out.println(f1.exists());
        try{
            FileInputStream fin = new FileInputStream(f1);
            FileOutputStream fout = new FileOutputStream(target);
            int data = -1;
             while((data = fin.read()) != -1 ){
                // System.out.println(data);
                  fout.write(data);
             }
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
