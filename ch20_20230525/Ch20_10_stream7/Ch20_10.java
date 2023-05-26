/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230525.Ch20_10_stream7;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch20_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList();
     list.add("Vivin");     
     list.add("Ken");     
     list.add("Iris");
     list.add("Joyce"); 
     list.add("Tom");  
     list.add("Lucy"); 
     list.stream().map(v->v.toUpperCase()).
                   forEach(v->System.out.println(v));
    IntSummaryStatistics intSum = 
            list.stream().mapToInt(v->v.length()).summaryStatistics();
    System.out.println(intSum.getAverage());
    System.out.println(intSum.getMax());
    System.out.println(intSum.getSum());
    
   Item max = list.stream().map(st->new Item(st,st.length())).
            max(Comparator.comparing(it->it.getLen())).get();
       System.out.println(max);
    
    }
    
}
