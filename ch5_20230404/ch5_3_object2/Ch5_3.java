/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20230404.ch5_3_object2;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {
    
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        //私有化屬性
        //提供公開的設定屬性方法
        //提供公開的取得屬性方法
       // emp1.name = "Lucy";// 長度大於等於2 小於等於50 不可為null
       emp1.setName(null);
        emp1.salary = 65000;
       // emp1.height = 170;//10 500
        emp1.setHeight(170);
        emp1.printInfo();
        
        
        
    }
    
}
