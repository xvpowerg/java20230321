/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230511.ch16_4_collection2;
import java.util.ArrayList;
public class Ch16_4 {

    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(25);
        list.add(31);
        list.add(1, 18);
        System.out.println(list);
        ArrayList<Integer> data = new ArrayList();
        data.add(37);
        data.add(39);
        data.add(52);
        list.addAll(data);
        System.out.println(list);
          //list.remove(25);    //這會找index為25的
        list.remove(Integer.valueOf(25));    
        System.out.println(list);
        list.removeIf(v->v < 20);
        System.out.println(list);
        list.replaceAll(v->v+20);
        System.out.println(list);
        
        ArrayList<Integer> list2 = new ArrayList(); 
        list2.add(10);
        list2.add(12);
        list2.add(16);
        list2.add(17);
        list2.add(16);
        list2.add(25);
        
        //找到回傳index 沒找到回傳-1
        int index = list2.indexOf(16);
        System.out.println(index);
        index = list2.indexOf(18);
        System.out.println(index);
        index = list2.lastIndexOf(16);
        System.out.println(index);
        //修改index 3的數字
        list2.set(3, 26);
        System.out.println(list2);
    }
    
}
