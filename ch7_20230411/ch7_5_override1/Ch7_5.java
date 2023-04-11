/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20230411.ch7_5_override1;

/**
 *
 * @author xvpow
 */
public class Ch7_5 {

/*  
    複寫條件
    1 Modifier 可以一樣 只能越來越開放不能封閉
    2 回傳值如果是基本型態 必須一樣 如果是參考可以是子類或一樣
    3 方法名稱參數類型必須一樣 
    4 例外拋出 可以出一樣 子類 或不拋
    */
    public static void main(String[] args) {
      
      Test1 t1 = new Test2();
      t1.showMsg();
      
    }
    
}
