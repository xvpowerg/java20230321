/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230504.Ch14_3_Inner2;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch14_3 {

    
        static void foreach(Consumer<String> style,String... value){
            for (String s : value){
                style.accept(s);
                //System.out.println(s);
            }
    }
    
    public static void main(String[] args) {
       
        //匿名內部類 不可修改區域變數數值
        //int count = 0;
        foreach(new Consumer<String>(){
          int count = 0;
          public void accept(String st){     
              count++;
             System.out.println(count+":"+st.toLowerCase());
          }    
        },"A","B","C","D");
        
    }
    
}
