/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230522.ch19_1_generic1;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        boolean throwEx = true;
//        if (throwEx){
//            throw TestGeneric.genException(IllegalArgumentException::new);
//        }
        List<String> arrayList1 = new ArrayList();
        arrayList1.add("Ken");
        arrayList1.add("Vivin");
        arrayList1.add("Lindy");
        List<Integer> arrayList2 = new ArrayList();
        arrayList2.add(52);
        arrayList2.add(83);
        arrayList2.add(77);
        arrayList2.add(62);
        
        TestGeneric.foreach(arrayList1, v->System.out.println(v));
        TestGeneric.foreach(arrayList2, v->System.out.println(v));
    }
    
}
