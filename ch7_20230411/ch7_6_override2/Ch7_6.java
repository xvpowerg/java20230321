/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20230411.ch7_6_override2;

/**
 *
 * @author xvpow
 */
public class Ch7_6 {

    /*  
    複寫條件
    1 Modifier 可以一樣 只能越來越開放不能封閉
    2 回傳值如果是基本型態 必須一樣 如果是參考可以是子類或一樣
    3 方法名稱參數類型必須一樣 
    4 例外拋出 可以出一樣 子類 或不拋
    */
    public static void main(String[] args) {
        // 1 Modifier 可以一樣 只能越來越開放不能封閉
        //Modifier
        //public  跨package要import類別就可讀取
        //protected 跨package要繼承才能讀取
        //default 相同package才可讀取
        //private 相同類別才可讀取
        Test1 t1 = new Test1();
        System.out.println(t1.publicV1);
        System.out.println(t1.protectedV2);
        System.out.println(t1.defaultV3);
         
    }
    
}
