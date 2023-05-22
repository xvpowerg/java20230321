/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230522.ch19_8_stream5;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch19_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ArrayList<String> data = new ArrayList();
        data.add("Vivin");
        data.add("Ken");
        data.add("Lucy");
        data.add("Ken");
        data.add("Iris");
        data.add("Lucy");
        data.stream().distinct().forEach(v->System.out.println(v));
        System.out.println("==================");
        ArrayList<String> data2 = new ArrayList();
        data2.add("a");
        data2.add("b");
        data2.add("c");
        data2.add("");
        data2.add("e");
        data2.add("f");
       //回傳flase才開始輸出
       data2.stream().dropWhile(v->!v.isEmpty()).forEach(v->System.out.println(v));
    }
    
}
