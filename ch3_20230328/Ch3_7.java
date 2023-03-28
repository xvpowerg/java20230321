/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230328;

/**
 *
 * @author xvpow
 */
public class Ch3_7 {

    /**
     * @param args the command line arguments
     */
    
    static void test1(){
      System.out.println("Test1");
    }
    static int test2(int a,int b){
        int ans = a + b;
        //return 回傳數值 離開函式
        return ans;
    }
    
    /*static int test3(int a,int b){
        int ans  = a * b;
        return ans;
    }*/
     static int test3(int ... values){
         int ans = values.length == 0?0:1;
         //values.length
        for (int v : values){
            ans = ans * v;
        }
        return ans;
    }
     
     //... 必須為最後一個參數
     static int test4(int a,int b,int ... values){
         int ans = a+ b;
         for (int v : values){
             ans += v;
         }
         return ans;
     }
      
    //static 只能呼叫 static的類型
    public static void main(String[] args) {
        test1();
        int v1 = test2(2,5);
        System.out.println(v1);
        int v2 = test3(3,2,5,7);
        System.out.println(v2);
        int v3 = test4(5,7,3,2,9);
        System.out.println(v3);      
    }
    
}
