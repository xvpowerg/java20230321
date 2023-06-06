/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230606.Ch23_2_io2;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
/**
 *
 * @author xvpow
 */
public class Ch23_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      File f1 = new File("C:\\mydir\\msg.txt");
      try(InputStreamReader in = new InputStreamReader(new FileInputStream(f1),
                "big5");){
          int data = -1;
          while( (data = in.read()) != -1){
              System.out.print((char)data);
          }
      }catch(IOException ex){
          System.out.println(ex);
      }
      
    }
    
}
