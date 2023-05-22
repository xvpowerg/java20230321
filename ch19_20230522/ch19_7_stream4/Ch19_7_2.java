/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230522.ch19_7_stream4;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch19_7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList<String> data = new ArrayList();
        data.add("Vivin");
        data.add("Ken");
        data.add("Lucy");
        data.add("Iris");
        //只要有一個元素不符合就短路 回傳false
        data.stream().peek(v->System.out.println("allMatch:"+v)).
                allMatch(v->v.length() > 3);
        System.out.println("========================");
       //只要有一個元素符合就短路 回傳true 
          data.stream().peek(v->System.out.println("anyMatch:"+v)).
                  anyMatch(v->v.startsWith("L"));
        System.out.println("========================");  
        //只要有一個元素符合就短路 回傳false 
         boolean b3 =  data.stream().peek(v->System.out.println("noneMatch:"+v)).
                  noneMatch(v->v.startsWith("L"));
         System.out.println(b3);
    }
    
}
