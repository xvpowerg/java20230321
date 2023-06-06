/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230606.Ch23_3_io3;
import java.io.FileWriter;
import java.io.File;
/**
 *
 * @author xvpow
 */
public class Ch23_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        File file = new File("c:\\mydir\\msg2.txt");
       try(FileWriter fw = new FileWriter(file);){
           fw.write("Hello!你好!!");
       } 
    }
    
}
