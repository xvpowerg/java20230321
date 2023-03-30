/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20230330;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {

        //多載(Overloading)
    /*
      1 找一樣類型
      2 找相同類型可相容
      3 找不同類型可相容
      4 轉封箱類型    
    */
    // 1 找一樣類型
    static void test1(int a){
        System.out.println("int a");
    }
    static void test1(float a){
        System.out.println("float a");
    }
    //2 找相同類型可相容
    static void test2(short s1){
               System.out.println("short s1");
    }
    static void test2(long v1){
        System.out.println("long v1");
    }
    //3 找不同類型可相容
    static void test3(short s1){
        System.out.println("short s1");
    }
    static void test3(double d1){
         System.out.println("double d1");
    }
    // 4 轉封箱類型 
    static void test4(byte b1){
        System.out.println("byte b1");
    }
    static void test4(Integer i2){
        System.out.println("Integer i2");
    }
    // 4 轉封箱類型 
    static void test5(short s1){
         System.out.println("short s1");
    }
    static void test5(Double d1){
        System.out.println("Double d1");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        test1(25);
        test2(15);//因為15是int所以執行test2(long v1)
        test3(2);//因為2是int所以執行test3(double d1)
        test4(5);//因為5是int所以執行 test4(Integer i2)
        //test5(10);//因為10是int所以轉換成Integer但是Integer無法相容於Double所以出錯
    }
    
}
