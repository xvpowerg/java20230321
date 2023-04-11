/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20230411.ch7_6_override2.t1;
import ch7_20230411.ch7_6_override2.Test1;
/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    
    public void showMsg(){
        //子類可呼叫protected
        System.out.println(this.protectedV2);
        System.out.println(this.publicV1);
       
    }
    
}
