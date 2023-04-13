/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230413.Ch8_4_override2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public int testInt(){
        return 25;
    }
    public Test1 testObj(){
        return new Test1();
    }
    
    public void testMethod(int v1){
        System.out.println("Test1 Methods:"+v1);
    }
}
