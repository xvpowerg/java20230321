/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230511.ch16_5_collection3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch16_5 {

    public static void main(String[] args) {
       Item i1 = new Item(1,"A");
       Item i2 = new Item(2,"B");
       Item i3 = new Item(3,"C");
       Item i4 = new Item(4,"D");
       Item del = new Item(3,"C");
       Item obj = new Item(2,"B");
       
       ArrayList <Item> list = new ArrayList();
       list.add(i1);
       list.add(i2);
       list.add(i3);
       list.add(i4);
       System.out.println(list);
       list.remove(del);
       System.out.println(list);
       int index = list.indexOf(obj);
       System.out.println(index);
    }
    
}
