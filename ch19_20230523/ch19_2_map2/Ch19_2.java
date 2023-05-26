/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230523.ch19_2_map2;
import java.util.Comparator;
import java.util.TreeMap;

public class Ch19_2 {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap();
        treeMap.put(8, "Ken");
        treeMap.put(2, "Iris");
        treeMap.put(5, "Vivin");
        treeMap.put(3, "Lucy");
        System.out.println(treeMap);
        Comparator<Item> cmp = Comparator.comparing(it->it.getPrice());
        cmp = cmp.thenComparing(it->it.getName());
         TreeMap<Item, String> treeMap2 = new TreeMap(cmp);
         Item it1 = new Item(10,"A");
         Item it2 = new Item(6,"B");
         Item it3 = new Item(8,"C");
         Item it4 = new Item(4,"D");
         Item it5 = new Item(2,"E");
         Item it6 = new Item(6,"F");
         treeMap2.put(it1, it1.getName());
         treeMap2.put(it2, it2.getName());
         treeMap2.put(it3, it3.getName());
         treeMap2.put(it4, it4.getName());
         treeMap2.put(it5, it5.getName());
         treeMap2.put(it6, it6.getName());
         System.out.println(treeMap2);
        
    }

}