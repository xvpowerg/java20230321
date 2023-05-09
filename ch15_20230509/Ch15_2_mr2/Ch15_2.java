/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20230509.Ch15_2_mr2;

/**
 *
 * @author xvpow
 */
public class Ch15_2 {

    static String runTest(int v){
        char c = 'A';
        String rusult = "";
        for (int i = 0;i < v;i++){
            rusult+= (char) (c + i%('Z'-'A'+1));//A~Z 字元                
        }
        return rusult;
    }
    public static void main(String[] args) {
       TestIF tesIF = Ch15_2::runTest;
       System.out.println(tesIF.test(30));
    }
    
}
