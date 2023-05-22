/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230522.ch19_4_stream3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Stream 有惰性 與 終端
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Lucy");
        list.add("Joy");
        //filter 是惰性的
       list.stream().peek(v->System.out.println("peek:"+v)).
               filter(n->n.length() > 3);
        //count 是終端
      long count =  
              list.stream().peek(v->System.out.println("Peek:"+v)).
                      filter(n->n.length() > 3).count();
      System.out.println(count);
      
      
      
    }
    
}
