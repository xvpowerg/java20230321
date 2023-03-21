/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1;

/**
 *
 * @author xvpow
 */
public class Ch1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte b1 = 10;//-128~127
        short s2 = 25;//-32768~32767
        int i3 = 25;//-2147483648~2147483647
        long longv = 555;
        
       System.out.println(b1+":"+s2+":"+i3+longv);
       
       float f1 = 5.8f;//32
       double d1 = 2.71828;//64
       System.out.println(f1+":"+d1);
      
       char c1 ='G'; //0~65535 16bit
       System.out.println(c1);
       
       boolean bool = true;
       System.out.println(bool);
        
      String msg = "ABCDE"; 
      System.out.println(msg);
    }
    
}
