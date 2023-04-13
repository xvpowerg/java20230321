/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230413.Ch8_2_mod1;

/**
 *
 * @author xvpow
 */
public class ProtectedTest2 {
    //建構式是protected 表示此類必須繼承才能使用此建構式
    protected ProtectedTest2(){
        System.out.println("ProtectedClass");
    }
    //建構式是public 表示此類只要import都能讀此建構式
    public ProtectedTest2(int v){
        System.out.println("ProtectedClass int");
    }
}
