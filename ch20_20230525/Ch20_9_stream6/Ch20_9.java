/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230525.Ch20_9_stream6;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch20_9 {

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
     Optional<String> op1 =  list.stream().parallel().findAny();
     Optional<String> op2 =  list.stream().findFirst();
     op1.ifPresent(v->System.out.println("Op1:"+v));
     op2.ifPresent(v->System.out.println("Op2:"+v));
    Comparator<String> cmp = Comparator.comparing(v->v);
    Optional<String> max =  list.stream().max(cmp);
    Optional<String> min =  list.stream().min(cmp);
    System.out.println(max);
    System.out.println(min);
    }
    
}
