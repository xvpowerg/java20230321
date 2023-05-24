/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230524.Ch20_2_stream2;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
/**
 *
 * @author xvpow
 */
public class Ch20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Iris");
       list.add("Tom");
       
       list.stream().map(str->str.toUpperCase()).forEach(v->System.out.println(v));
       System.out.println("==========================");
     IntSummaryStatistics intSunm =  list.stream().mapToInt(st->st.length()).summaryStatistics();
     System.out.println(intSunm.getAverage());
     System.out.println(intSunm.getCount());
     System.out.println(intSunm.getMax());
     System.out.println(intSunm.getMin());
    System.out.println("==========================");   
     
    }
    
}
