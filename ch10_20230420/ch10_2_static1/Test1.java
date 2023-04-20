/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230420.ch10_2_static1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    String nonStatic = "MyTest1";
    static String staticValue = "MyTest1Static";
    
    public static int max(int a,int b){
        return a >b ? a: b;
    }
    public String toString(){
        return nonStatic+":"+staticValue;
    }
    
}
