/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230413.Ch8_5_exception1;

/**
 *
 * @author xvpow
 */
public class Ch8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student();
       st1.setAge(400);//發生問題 不繼續執行程式? 使用例外
       st1.printInfo();
    }
    
}
