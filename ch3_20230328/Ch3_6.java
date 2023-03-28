/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230328;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strB = "true";
        boolean b1 =   Boolean.parseBoolean(strB);
        System.out.println(b1);
        
        String strB2 = "tRUe";
        boolean b2 = Boolean.parseBoolean(strB2);
        System.out.println(b2);
        
          String strB3 = "aaaa";
        boolean b3 =   Boolean.parseBoolean(strB3);//只要轉換數值不是true就回傳false
        System.out.println(b3);
        
       /* int v1 = Integer.parseInt("aaaa");//java.lang.NumberFormatException
        System.out.println(v1);*/
        
//        String b4 = "false";
//        System.out.println(b4.equalsIgnoreCase("false"));
    }
    
}
