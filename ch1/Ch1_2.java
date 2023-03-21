/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1;

/**
 *
 * @author xvpow
 */
public class Ch1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int a = 10;
      int b = 20;
      System.out.println(a > b);
      System.out.println(a < b);
      System.out.println(a >= b);
      System.out.println(a <= b);
      System.out.println(a == b);
      System.out.println(a != b);
        
      String s1 = "Ken";
      String s2 = "Ken";
      String s3 = new String("Ken");
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s1 == s2);
      System.out.println(s1 == s3);
      //物件的比較使用equals
      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
        
    }
    
}
