/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230425.Ch11_6_InnerClass3;

/**
 *
 * @author xvpow
 */
public class TestInner3 {
   public static int min(int a,int b){
       return a < b?a:b;
   }
    public static class MyInner3{
        public int sum(int ... values){
             int total = 0;
             for (int v : values){
                 total += v;
             }
             return total;
        }
    }
}
