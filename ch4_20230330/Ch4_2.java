/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20230330;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {
//把變數放進函式內，變數的數質會被改變嗎?
    //基本型態類型都是Call By Value
    static void swap(int a,int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
    //參考類型有機會改變內容 call by reference
     static void swap(int[] array){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
     }   
     
     //字串本身不可變
     static void swap(String s1,String s2){
          String tmp = s1;          
            s1 = s2;
            s2 = tmp;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 16;
        System.out.println(a+":"+b);
        swap(a,b);
        System.out.println(a+":"+b);
        
        int[] array = {12,17};
        System.out.println(array[0]+":"+array[1]);
       swap(array);
        System.out.println(array[0]+":"+array[1]);
        
        String s1 = "A1";
        String s2 = "B2";
        System.out.println(s1+":"+s2);
        swap(s1,s2);
        System.out.println(s1+":"+s2);
        
  
    }
    
}
