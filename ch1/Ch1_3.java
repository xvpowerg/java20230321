/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1;

/**
 *
 * @author xvpow
 */
public class Ch1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;      
        System.out.println(x++);//0
        System.out.println(++x);//2
        
        int g = 0;
        int ans = 2 + ++g + 1 + g++ ;
        //        2 +  1  + 1 + 1
        System.out.println(ans);
        System.out.println(g);
        
        int y = 0;
        y = y + 3;
        System.out.println(y);
        
        int n = 0;
        n +=  2.5;
        System.out.println(n);
        
    }
    
}
