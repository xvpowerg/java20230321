/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230420.ch10_5_initblack3;

/**
 *
 * @author xvpow
 */
public class Test3 {
    public static void testStatic(){
        System.out.println("testStatic");
    }
    
    Test3(){
        System.out.println("Test3()");
    }
    
    {
    System.out.println("Test3 {} 1");
    }
    
    static {
    System.out.println("Test3 static {} 1");
    }
    
    {
        System.out.println("Test3 {} 2");    
    }
    static {
        System.out.println("Test3 static {} 2");
    }
}
