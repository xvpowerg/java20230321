/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20230509.Ch15_1_mr1;

/**
 *
 * @author xvpow
 */
public class Ch15_1 {

   static void myMR(){
       System.out.println("myMR!!");
   }
    public static void main(String[] args) {
        
        TestIF tif = Ch15_1::myMR;
        tif.action();
        
    }
    
}
