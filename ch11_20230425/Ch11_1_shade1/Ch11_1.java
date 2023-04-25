/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20230425.Ch11_1_shade1;

/**
 *
 * @author xvpow
 */
public class Ch11_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //所有屬性都是遮蔽
       //所有靜態的都是遮蔽
       
       //遮蔽看類別
       //複寫看物件
       Test1 t1 = new Test2();
       t1.testStaitc();
       t1.printInfo();
    }
    
}
