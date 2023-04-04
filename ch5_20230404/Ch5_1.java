/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20230404;

/**
 *
 * @author xvpow
 */
public class Ch5_1 {

    
    //多載(Overloading)
    /*
      1 找一樣類型
      2 找相同類型可相容
      3 找不同類型可相容
      4 轉封箱類型    
    */
    
    static void test1(int a1,float f1){
        System.out.println("int a1,float f1");
    }
    static void test1(int a1,short s1){
        System.out.println("int a1,short s1");
    }
    static void test2(int a1,int a2,Integer v1){
        System.out.println("int a1,int a2,Integer v1");
    }
      static void test2(int a1,int a2,int a3){
        System.out.println("int a1,int a2,int a3");
    }
      //無確定可選的參數
      static void test3(int a1,Integer a2){
          System.out.println("int a1,Integer a2");
      }
      static void test3(Integer a1,int a2){
          System.out.println("Integer a1,int a2");
      }
    public static void main(String[] args) {
        short s1 = 20;
        test1(10,20);        
        test2(10,20,50);
        
        //無確定可選的參數
        //test3(10,50);
    }
    
}
