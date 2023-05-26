/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230525.Ch20_3_stream3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch20_3 {

  
    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList();
     list.add("Vivin");     
     list.add("Iris");
     list.add("Ken");     
     list.add("Joyce");     
     System.out.println(list);
     System.out.println("=========================");
     list.stream().filter(p->p.length() > 3).forEach(v->System.out.println(v));
     System.out.println("=========================");
       //Stream不會改變原始物件
      System.out.println(list);
    System.out.println("========================="); 
      //Stream 有分惰性與終端
    long count = list.stream().peek(v->System.out.println("p1:"+v)).
            filter(f->{
                System.out.println(f);
                return f.length() > 4;
            }).peek(v->System.out.println("p2:"+v)).count();
    System.out.println(count);
    }
    
}
