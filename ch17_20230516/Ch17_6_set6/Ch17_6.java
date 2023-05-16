/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230516.Ch17_6_set6;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch17_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Comparator<Product> cmp = Comparator.comparing(p->p.getPrice());
      cmp = cmp.thenComparing(p->p.getName()).
              thenComparing(p->p.getLocation());
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
