/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230516.Ch17_2_set2;

import java.util.HashSet;

/**
 *
 * @author xvpow
 */
public class Ch17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Item> set = new HashSet();

        Item i1 = new Item("A", 25);
        Item i2 = new Item("B", 51);
        Item i3 = new Item("C", 86);
        Item i4 = new Item("D", 18);
        Item search = new Item("D", 18);
      //  System.out.println("equals:"+i4.equals(search));
        set.add(i1);
        set.add(i2);
        set.add(i3);
        set.add(i4);
        System.out.println("==============");
        System.out.println(set.contains(search));
        
    }

}
