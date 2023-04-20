/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230420.ch10_3_initblack1;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Test1 {
    private int count = 0;
    private String msg;
    private static Random rand = new Random();
    private int[] array1 = new int[500];
      { //比建構式早呼叫
          appendArray();  
      }
    
    
    public int getArrayValue(int i){
      return   array1[i];
    }
  
    Test1(){
       // appendArray();
    }
    
    Test1(int count){        
        this.count = count;        
    }
    
    Test1(int count,String msg){
        this.count = count;
        this.msg = msg;
    }
    
    private void appendArray(){
        
        for (int i = 0; i < array1.length;i++){
             int v =  rand.nextInt(100000);
             array1[i] = v;
        }
    }
}
