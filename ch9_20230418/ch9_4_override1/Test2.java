/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20230418.ch9_4_override1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    //不throws 
    //throws MainException
    //throws SubException
    @Override
     public void testEx1()throws SubException{
        System.out.println("Test2 testEx1");
        throw new SubException("SubException");
    }
}
