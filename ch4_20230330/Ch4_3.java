/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20230330;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {

    //多載(Overloading)
    static int sum(int a,int b ){
        return sum(a,b,0);
    }
    
    //多載 可用於給預設值
    static int sum(int a){
        return sum(a,0,0);
    }
    
    static int sum(int a,int b,int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(sum(5,6));
        System.out.println(sum(9,7));
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,18));
        System.out.println(sum(5));
         
    }
    
}
