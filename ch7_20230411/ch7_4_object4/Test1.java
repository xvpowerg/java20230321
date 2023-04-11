/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20230411.ch7_4_object4;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        this("");
        System.out.println("Test1()");
    }
    Test1(String v1){
        this(v1,10);
         System.out.println("Test1(String)");
    }
    
    Test1(String v1,int v2){
         System.out.println("Test1(String int)");
    }
}
