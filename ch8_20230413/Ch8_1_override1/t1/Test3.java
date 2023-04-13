/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230413.Ch8_1_override1.t1;
import ch8_20230413.Ch8_1_override1.Test1;
/**
 *
 * @author xvpow
 */
public class Test3  extends Test1{
    @Override
    public void testPublic(){
        System.out.println("Test3 testPublic");
    }
    
    protected void testProtected(){
         System.out.println("Test3 testProtected");
    }
    //跨package不可複寫Default方法
    void testDefault(){
         System.out.println("Test3 testDefault");
    }
}
