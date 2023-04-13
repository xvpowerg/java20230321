/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230413.Ch8_1_override1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    //只能public
    public  void testPublic(){
        System.out.println("Test2 testPublic");
    }
    @Override
    //public protected
    protected void testProtected(){
        System.out.println("Test2 testProtected");  
    }
   // public protected default 
    void testDefault(){        
        System.out.println("Test2 testDefault");  
    }
    //私有方法不可Override
    //@Override
    public void testPrivate(){      
        System.out.println("Test2 testPrivate");
    }
}
