/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ch20_20230524.Ch20_1_stream1;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch20_1 {

    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Iris");
       list.add("Tom");
       //findAny 用於parallel
       Optional<String> opt1 =  list.stream().parallel().findAny();
       Optional<String> opt2 = list.stream().findFirst();
       System.out.println(opt1.get());
       System.out.println(opt2.get());
       System.out.println("==========================");
       list.stream().parallel().forEachOrdered(v->System.out.println(v));
       System.out.println("==========================");
       list.stream().limit(3).forEach(v->System.out.println(v));
       System.out.println("==========================");
       list.stream().skip(3).forEach(v->System.out.println(v));
    }
}
