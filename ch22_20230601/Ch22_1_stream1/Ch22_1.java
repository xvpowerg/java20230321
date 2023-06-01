/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230601.Ch22_1_stream1;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
public class Ch22_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item i1 = new Item("A",25);
       Item i2 = new Item("B",71);
       Item i3 = new Item("C",83);
       Item i4 = new Item("A",61);
       Item i5 = new Item("D",88);
       Item i6 = new Item("B",32);
       Item i7 = new Item("B",12);
       Item i8 = new Item("C",27);
       ArrayList<Item> list = new ArrayList<>();
       list.add(i1);
       list.add(i2);
       list.add(i3);
       list.add(i4);
       list.add(i5);
       list.add(i6);
       list.add(i7);
       list.add(i8);
       
      Map <String,List<Item>> group = 
              list.stream().collect(Collectors.groupingBy(v->v.getName()));
      System.out.println(group);
      
     Map<String,Long>  groupCount = 
             list.stream().collect(Collectors.groupingBy(v->v.getName(),Collectors.counting()));
     System.out.println(groupCount);
     
   Map<String,List<Integer>> groupPrice = list.stream().collect(Collectors.groupingBy(v->v.getName(),
             Collectors.mapping(it->it.getPrice(),Collectors.toList() )));
     System.out.println(groupPrice);
     
     Map<String,Integer> groupPriceSum =  list.stream().collect(Collectors.groupingBy(v->v.getName(),
             Collectors.summingInt(it->it.getPrice())));
      System.out.println(groupPriceSum); 
      
     Map<Boolean,List<Item>> partition =
             list.stream().collect((Collectors.partitioningBy(it->it.getPrice() > 50)));
     System.out.println(partition);
     
     
    }
    
}
