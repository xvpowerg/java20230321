/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230418.ch9_2_exception2;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch9_2 {

    
    static void test(boolean thEx)throws Exception{
        if (thEx){
            throw new  Exception();
        }
        
        
    }
    
    public static void main(String[] args) {
       
        try{
            test(true);
          
        }catch(Exception ex){
            System.out.println(ex);
        }finally{
           System.out.println("Close");   
        }
        
            MyIO io  = null;
        try{
            io  = new MyIO();
            io.copy();
        }catch(IOException ex){
          System.out.println(ex);
        }finally{
            io.close();
        }
        
    }
    
}
