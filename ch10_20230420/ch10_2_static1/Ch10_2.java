/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20230420.ch10_2_static1;

/**
 *
 * @author xvpow
 */
public class Ch10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        System.out.println(t1);
        t1.nonStatic = "main nonStatic1";       
        t2.nonStatic = "main nonStatic2";
        //static 會共享變數
        //static是屬於class的
        t1.staticValue = "main staticValue1";
        t2.staticValue = "main staticValue2";
        //靜態呼叫的正確寫法
        Test1.staticValue = "main staticValue2";
          System.out.println(t1);
           System.out.println(t2);
           System.out.println(Test1.max(21, 18));
    }
    
}
