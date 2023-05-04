/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230504.Ch14_1_if1;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch14_1 {

  public static List<String> filter(List<String> data,
          Predicate<String> p){
        List<String> result = new ArrayList();
        for (String st : data){
            if (p.test(st)){
               result.add(st);
            }
        }
        return result;
    }
    public static void main(String[] args) {
       List<String> nameList = new ArrayList<>();
       nameList.add("Vivin");
       nameList.add("Lucy");
       nameList.add("Joy");
       nameList.add("Ggigi");
       TestStringLen tLen = new TestStringLen();
        List<String> newList = filter(nameList,tLen);
        System.out.println(newList);
        
        TestStringLen tLen4 = new TestStringLen(4);
        List<String> newList2 = filter(nameList,tLen4);
        System.out.println(newList2);
    }
    
}
