/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230504.Ch14_4_lambda1;

/**
 *
 * @author xvpow
 */
public class Ch14_4 {

     
    static void testTest(TestIF1 tf1){
        tf1.run();
    }
    
    public static void main(String[] args) {
        
        testTest(()->{System.out.println("Test1!!");});
        testTest(()->System.out.println("Test2!!"));
    }
    
}
