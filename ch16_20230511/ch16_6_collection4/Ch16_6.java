/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230511.ch16_6_collection4;
import java.util.LinkedList;
public class Ch16_6 {

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> list = new LinkedList();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list);
        
        String v = list.pop();
        System.out.println(v);
        System.out.println(list);
    }
    
}
