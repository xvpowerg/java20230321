/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230516.Ch17_1_set1;
import java.util.HashSet;
public class Ch17_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        //內容不會重複
        //取出的順序 與放入順不一定相同
        //沒有get可用
        HashSet<Integer> set = new HashSet();
        set.add(25);
        set.add(15);
        set.add(31);
        set.add(9);
        set.add(17);
        set.add(15);
        
        for (int v : set){
            System.out.println(v);
        }
        System.out.println("============================");
        set.forEach(v->{System.out.println(v);});        
        System.out.println(set.contains(17));
          System.out.println(set.contains(11));
    }
    
}
