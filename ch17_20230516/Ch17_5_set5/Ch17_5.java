/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230516.Ch17_5_set5;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch17_5 {
    /*
     回傳正數 p1 > p2
     回傳負數 p1 < p2
     回傳0 p1 = p2
    
    */
    private static class MyComparator implements Comparator<Product>{
        public int compare(Product p1,Product p2){
            int cmpName = 0;
            if (p1.getPrice() > p2.getPrice()){
                return 1;
            }else if(p1.getPrice() < p2.getPrice()){
                return -1;
            }else if(( cmpName = p1.getName().compareTo(p2.getName()) )!= 0){
                return cmpName;
            }
            return p1.getLocation().compareTo(p2.getLocation());
        }
    }
    public static void main(String[] args) {
        MyComparator cmp = new MyComparator();
    TreeSet<Product> set = new TreeSet(cmp);
    Product p1 = new Product("A","AA",10);
    Product p2 = new Product("B","BB",20);
    Product p3 = new Product("C","CC",10);
    Product p4 = new Product("B","GG",20);
    Product p5 = new Product("H","HH",30);
    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);
    set.add(p5);
    System.out.println(set);
    }
    
}
