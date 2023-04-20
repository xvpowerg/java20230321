/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20230420.ch10_5_initblack3;

/**
 *
 * @author xvpow
 */
public class Ch10_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Test3.testStatic();
       Test3 t3 = new Test3();
       //static {}只會呼叫一次  {}區塊 new幾次呼叫幾次
       Test3 t4 = new Test3();
    }
    
}
