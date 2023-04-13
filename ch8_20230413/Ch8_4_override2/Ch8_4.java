/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230413.Ch8_4_override2;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {

       /*  
    複寫條件
    1 Modifier 可以一樣 只能越來越開放不能封閉
    2 回傳值如果是基本型態 必須一樣 如果是參考可以是子類或一樣
    3 方法名稱參數類型必須一樣 
    4 例外拋出 可以出一樣 子類 或不拋
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test2();
        System.out.println(t1.testInt());
         System.out.println(t1.testObj());
        Test2 t2 = new Test2();   
        t2.testMethod(10);
        t2.testMethod((byte)7);
    }
    
}
