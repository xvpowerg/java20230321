/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230502.Ch13_6_if6;
import java.util.List;
import java.util.function.Supplier;
// Supplier<T>  T get()
public class Ch13_6 {

    static List collectionData(Supplier<List<String>> sup,String ... data){
        List<String> collect = sup.get();        
        for (String v : data){
            collect.add(v);
        }
        return collect;
    }
    public static void main(String[] args) {
        ListSupplier ls = new ListSupplier();
        var v = collectionData(ls,"A","B","C");
        System.out.println(v);
        // TODO code application logic here
    }
    
}
