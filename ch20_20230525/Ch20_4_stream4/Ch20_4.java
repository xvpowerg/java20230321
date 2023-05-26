/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230525.Ch20_4_stream4;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch20_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList();
     list.add("Vivin");     
     list.add("Iris");
     list.add("Ken");     
     list.add("Joyce");   
     
     //每個元素都要符合條件
     boolean b1 = list.stream().allMatch(p->p.length() > 2);
     System.out.println(b1);
     //任一個元素符合條件
     boolean b2 = list.stream().anyMatch(p->p.length() < 4);
     System.out.println(b2);
     //沒有元素符合條件
     boolean b3 = list.stream().noneMatch(p->p.length() < 2);
     System.out.println(b3);
     
    //短路 
    //只要一個條件不成立短路
   boolean b4 =  list.stream().peek(v->System.out.println("p1:"+v)).
           allMatch(v->v.length() > 3);
   System.out.println(b4);
   System.out.println("======================");
   //只要一個條件成立短路
   boolean b5 = list.stream().
           peek(v->System.out.println("p2:"+v)).anyMatch(v->v.length() == 4);
     System.out.println(b5);
     //只要一個條件成立短路 noneMatch會回傳false
      boolean b6 = list.stream().
           peek(v->System.out.println("p3:"+v)).noneMatch(v->v.length() == 4);
     System.out.println(b6);
     
     
    }
    
}
