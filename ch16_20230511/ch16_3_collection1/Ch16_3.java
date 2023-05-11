/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230511.ch16_3_collection1;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.ArrayList;
public class Ch16_3 {

    public static void main(String[] args) {
       ArrayList<Integer> listA = new ArrayList();
       listA.add(50);
       listA.add(25);
       listA.add(16);
       listA.add(21);       
       System.out.println(listA.get(1));
       
       for (int i = 0; i < listA.size();i++){
           System.out.println(i+":"+listA.get(i));
       }
       System.out.println("==================");
       for (int v : listA){
           System.out.println(v);
       }
       System.out.println("==================");       
       listA.forEach(v->{           
           System.out.println(v);});
    }
    
}
