/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20230530.ch21_1_stream1;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
public class Ch21_1 {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Joy");
       list.add("Iris");
       
       list.stream().map(v->v.toUpperCase()).forEach(v->System.out.println(v));
       //System.out.println(list.get(2));
       IntSummaryStatistics iss = 
               list.stream().mapToInt(v->v.length()).summaryStatistics();
        long sum =  iss.getSum();
        System.out.println(sum);
    }
    
}

