/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230523.ch19_5_generic3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     TestGeneric tg = new TestGeneric();
     int v1 = tg.testGen(10);
     System.out.println(v1);
     String v2 = tg.testGen("String");
     System.out.println(v2);
     ArrayList<Integer> list = new ArrayList();
     ArrayList<Integer> list2 = 
             tg.<ArrayList<Integer>>testGen(list);
     
 ArrayList<Integer> myData = tg.getData(()->{
         ArrayList<Integer> data = new ArrayList();
         data.add(10);
         data.add(5);
         data.add(1);
         data.add(3);
         return data;
     });
     
        System.out.println(myData);
        
        boolean canThrow = false;
        if (canThrow){         
            throw tg.getException(()->new IllegalArgumentException());          
        }
        
          int len = TestGeneric.map("Ken", v->v.length());
          System.out.println(len);
          
         ArrayList<Integer> data = new ArrayList();
         data.add(10);
         data.add(5);
         data.add(1);
         data.add(3);
      String value = TestGeneric.map(data, d->{
           String result = "";
           for (Integer v : d){
               result +=v+" ";
           }
           return result;
         });
      System.out.println(value);
    }
    
}
