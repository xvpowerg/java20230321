/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1;

/**
 *
 * @author xvpow
 */
public class Ch1_4 {

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        int c = 50;
        
        //且 && 兩邊才為真
        //或 || 單邊為真就是真
        //反向 ! 唱反調
        //互斥 ^ 一真一假才為真
        
        
        System.out.println(a < b && b < c);
        System.out.println(a > b && b < c);
        System.out.println("======================");
        System.out.println(a > b || b < c);
        System.out.println(a > b || b > c);
        System.out.println("==========!============");
        System.out.println( !(b < c));
        System.out.println("======================");
        System.out.println(a > b ^ b < c);
        System.out.println("==========短路============");
        int i = 0;
        boolean b1 = a > b && ++i < c;                
        System.out.println(i);
        System.out.println(b1);
        boolean b2 = a < b || ++i < c;
        System.out.println(i);
        System.out.println(b2);
        
    }
    
}
