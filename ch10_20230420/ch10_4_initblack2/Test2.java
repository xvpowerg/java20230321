/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230420.ch10_4_initblack2;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Test2 {
     private static Random rand = new Random();
      private static int[] array1 = new int[500];
      static{
         appendArray();      
      }
    
   public static int getArrayValue(int i){
      return   array1[i];
    }
      private static void appendArray(){
        
        for (int i = 0; i < array1.length;i++){
             int v =  rand.nextInt(100000);
             array1[i] = v;
        }
    }
}
