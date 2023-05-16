/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230516.Ch17_3_set3;
import java.util.TreeSet;
public class Ch17_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Integer> set = new TreeSet();
        //小到大排序
        set.add(8);
        set.add(3);
        set.add(16);
        set.add(5);
        set.add(13);
        set.forEach(v ->System.out.println(v));
         System.out.println("===========================");
        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println("===========================");
       System.out.println(set.ceiling(5)) ;//set 內容是否有剛好>=5的
       System.out.println(set.higher(5)); //set 內容是否有剛好>5的       
          System.out.println("===========================");        
        System.out.println(set.floor(8));//set 內容是否有剛好<=8的
         System.out.println(set.lower(8));///set 內容是否有剛好<8的
          System.out.println(set.lower(2));///set 內容是否有剛好<8的
          //int v = set.lower(2);        
    }
    
}

