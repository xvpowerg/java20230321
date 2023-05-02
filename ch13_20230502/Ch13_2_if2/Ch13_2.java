/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230502.Ch13_2_if2;

/**
 *
 * @author xvpow
 */
public class Ch13_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestIFObj obj = new TestIFObj();
        TestIF1 t1 = obj;
        t1.printInfo();
        TestIF2 t2 = obj;
        t2.printInfo();
        t2.showMsg();
        TestIF3 t3 = obj;
        t3.showMsg();
         
    }
    
}
