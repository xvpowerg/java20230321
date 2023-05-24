/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230524.Ch20_5_stream5;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch20_5 {
    
    public static void main(String[] args) {
        Item item1 = new Item("A",25);
        Item item2 = new Item("B",13);
        Item item3 = new Item("C",12);
        Item item4 = new Item("D",17);
        Item item5 = new Item("D",18);
        ArrayList<Item> list = new ArrayList<>();
        list.add(item1);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
       Map<String,Integer> map1 = 
               list.stream().collect(Collectors.toMap(it->it.getName(), 
                it->it.getValue(),(ov1,nv2)->{
                    System.out.println("m:"+ov1+":"+nv2);
                return ov1+nv2;
                }));

       System.out.println(map1);
        
    }
    
}
