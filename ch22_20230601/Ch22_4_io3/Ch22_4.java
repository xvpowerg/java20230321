/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230601.Ch22_4_io3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch22_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File src = new File("c:\\mydir\\netbeans-17-bin.zip");
        File target = new File("c:\\mydir\\netbeans-17-bin-copy.zip");
        FileInputStream fiin = null;
          FileOutputStream fout = null;
        try{
             fiin = new FileInputStream(src);
             fout = new  FileOutputStream(target);       
            byte[] buffer = new byte[1024*1024];
            int index = -1;
             while(  (index = fiin.read(buffer)) != -1 ){                
                     fout.write(buffer, 0, index);
                }
           
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }finally{
            try{
                 fout.close();
                fiin.close();
            }catch(IOException ex){
                System.out.println(ex);
            }
            
        }
        
        
    }
    
}
