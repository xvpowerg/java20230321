/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20230420.ch10_1_objmth1;
public class Ch10_1 {

    public static void main(String[] args) {
      Item item1 = new Item("A1",150);
      Item item2 = new Item("A2",170);
      Item item3 = new Item("A1",150);
      int[] array1 = new int[3];
      
      System.out.println(item1.equals(item2));
      System.out.println(item1.equals(item3));
      System.out.println(item2);
      System.out.println(item3);
     
    }
    
}

