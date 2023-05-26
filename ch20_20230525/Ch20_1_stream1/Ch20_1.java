/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230525.Ch20_1_stream1;
import java.util.ArrayList;
public class Ch20_1 {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
       list.add(25);
       list.add(10);
       list.add(18);
       list.add(31);
       list.add(15);
       //輸出所以的奇數
       for (int v : list){
           if (v % 2 != 0){
               System.out.println(v);
           }
       }
       System.out.println("==========================");
       list.stream().filter(v->v%2 !=0).forEach(x->System.out.println(x));
       
    }
    
}
