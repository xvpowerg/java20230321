/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230413.Ch8_4_override2;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    // 2 回傳值如果是基本型態 必須一樣 如果是參考可以是子類或一樣
        public int testInt(){
           return 75;
        }
        // 2 回傳值如果是基本型態 必須一樣 如果是參考可以是子類或一樣
        public Test2 testObj(){
            return new Test2();
        }
      public void testMethod(byte v1){
        System.out.println("Test2 byte Methods:"+v1);
    }
        
}
