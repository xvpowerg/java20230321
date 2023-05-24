/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230524.Ch20_3_stream3;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch20_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
     list.add(25);
     list.add(10);
     list.add(12);
     list.add(15);
     
 Optional<Integer> ans = list.stream().reduce((v1,v2)->{
        System.out.println(v1+":"+v2);
        return v1+v2;
     });
     System.out.println(ans.get());
     
     System.out.println("==============================");
     int ans2 =   list.stream().reduce(2, (v1,v2)->{
          System.out.println(v1+":"+v2);
      return v1+v2;
      });
     System.out.println(ans2);
        System.out.println("==============================");
    int ans3 =   list.stream().reduce(1, (v1,v2)->{
            System.out.println(v1+":"+v2);
            return v1+v2;
        }, (v1,v2)->{
            System.out.println("combiner:"+v1+":"+v2);
           return v1+v2;
        });
    System.out.println(ans3);
     System.out.println("=============================="); 
    
      int ans4 =   list.stream().parallel().reduce(1, (v1,v2)->{
            System.out.println(v1+":"+v2);
            return v1+v2;
        }, (v1,v2)->{
            System.out.println("combiner:"+v1+":"+v2);
           return v1+v2;
        });
    System.out.println(ans4);
    }
    
}
