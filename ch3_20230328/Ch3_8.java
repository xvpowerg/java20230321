/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230328;

/**
 *
 * @author xvpow
 */
public class Ch3_8 {

   //遞迴
    
    static void test(int v){
        System.out.println(v);
        if (v <3){
            test(v + 1);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //函式呼叫自己
        //一定要有停止條件
        
        test(1);
    }
    
}
