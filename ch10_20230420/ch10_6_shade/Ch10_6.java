/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20230420.ch10_6_shade;

/**
 *
 * @author xvpow
 */
public class Ch10_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //所有屬性都是遮蔽
       //所有靜態的都是遮蔽
       
       //遮蔽看類別
       //複寫看物件
        
       
       Test1 t1 = new Test2();
        t1.print();
        System.out.println(t1.value);
    }
    
}
