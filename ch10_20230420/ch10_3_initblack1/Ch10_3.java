/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20230420.ch10_3_initblack1;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Test1 t1 = new Test1();
      System.out.println(t1.getArrayValue(2));
      System.out.println(t1.getArrayValue(7));
      System.out.println(t1.getArrayValue(11));
        Test1 t2 = new Test1(5);
       System.out.println(t2.getArrayValue(2));
         System.out.println(t2.getArrayValue(3));
      Test1 t3 = new Test1(5,"Msg");
      System.out.println(t3.getArrayValue(2));
         System.out.println(t3.getArrayValue(3));
    }
    
}

