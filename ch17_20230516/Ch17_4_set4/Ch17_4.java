/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20230516.Ch17_4_set4;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch17_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TreeSet<Student> set = new TreeSet();
      Student st1 = new Student("Ken",95);
      Student st2 = new Student("Vivin",72);
      Student st3 = new Student("Lucy",63);
      Student st4 = new Student("Iris",78);
      Student st5 = new Student("Lindy",45);
      Student st6 = new Student("Joy",72);
      set.add(st1);      
      set.add(st2);
      set.add(st3);
      set.add(st4);
      set.add(st5);
       set.add(st6);
      System.out.println(set);
      
      
      
    }
    
}

