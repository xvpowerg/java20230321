/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20230330;

/**
 *
 * @author xvpow
 */
public class Ch4_1 {
    
    static void testLoop(int v){
        System.out.println("Start:"+v);
        if (v < 3){
          testLoop(v + 1);   
        }
        System.out.println("End:"+v); 
    }
    public static void main(String[] args) {
        int x = 5;
        testLoop(1);
        System.out.println("main:"+x);
        
    }
    
}
