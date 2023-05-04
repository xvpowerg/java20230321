/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230504.Ch14_2_Inner1;
import java.util.function.Predicate;
import ch14_20230504.Ch14_1_if1.Ch14_1;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch14_2 {
    private static class MyCat extends Cat{
         public void bark(){             
             System.out.println("汪汪叫");
         }
    }    
    public static void main(String[] args) {        
        List<String> dataList = new ArrayList<>();
        dataList.add("A");
        dataList.add("B");
        dataList.add("CC");
        dataList.add("DDD");
        dataList.add("EEEEE");
       //Predicate        
      List<String> newData =  Ch14_1.filter(dataList, new Predicate<String>(){
           public boolean test(String str){
               if (str.length() > 2){
                   return true;
               }
               return false;
           }
        });
        
      System.out.println(newData);
        
        Cat c1 = new Cat();
        c1.bark();
        Cat c2 = new MyCat();
        c2.bark();
        Cat c3 = new Cat(){
          public void bark(){
             System.out.println("支支叫");
          }              
        };
        c3.bark();

    }
    
}
