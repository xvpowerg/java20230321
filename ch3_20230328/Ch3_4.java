/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230328;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Boxing 封箱
        //基本型態變物件 就是封箱
        //特別的物件變基本型態 就是解封箱
        /*
        byte   Byte
        short Short
        int  Integer
        long Long
        
        float Float
        double Double
        
        char Charater
        boolean Boolean
        
        */
        int v1 = 5;
        Integer box1 = Integer.valueOf(v1);//封箱
        int v2 = box1.intValue();//解封箱
        
        System.out.println(box1.getClass());
        System.out.println(v2);
        //自動封箱
        int v3 = 56;
        Integer box2 = v3;
        //自動解封箱
        int v4 = box2;
        System.out.println(v4);
        
        Integer box3 = null;
        int v5 = box3;
         System.out.println(v5);
         
         
              
    }
    
}
