/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20230530.ch21_4_stream4;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ch21_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Joy");
       list.add("Iris");
       ArrayList data = new ArrayList();
      List<String> nameList =   list.stream().filter(n->n.length() > 3).
                                collect(Collectors.toList());
       System.out.println(nameList);
     ArrayList<String> data2 =   list.stream().filter(n->n.length() == 3).
               collect(Collectors.toCollection(ArrayList::new));
     System.out.println(data2);
     
     TreeSet<String> set = list.stream().collect(Collectors.toCollection(TreeSet::new));
     System.out.println(set);
     
    String msg =  list.stream().collect(Collectors.joining(",", "Title:", "."));
    System.out.println(msg);
    
    String json = list.stream().collect(Collectors.joining(",", "[", "]"));
    System.out.println("{data:"+json+"}");            
    
    
    String url = list.stream().collect(Collectors.joining(" ", "<a href='http://google.com.tw'>", "</a>"));
    System.out.println(url);    
    
//   String rop = list.stream().reduce("",(v1,v2)->{           
//           return v1+"<li>"+v2+"</il>";
//       });
//      
//      System.out.println("<ul>"+rop+"</ul>");
      
    }
    
}
