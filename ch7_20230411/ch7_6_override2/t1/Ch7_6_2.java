/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20230411.ch7_6_override2.t1;
import ch7_20230411.ch7_6_override2.Test1;
/**
 *
 * @author xvpow
 */
public class Ch7_6_2 {
    //跨package 必須import
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1();
        //跨package可讀取public
        System.out.println(t1.publicV1);
        Test2 t2 = new Test2();
        t2.showMsg();
        
        
    }
    
}
