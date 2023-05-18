/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230518.ch18_1_set1;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch18_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Student st1 = new Student("Ken",95,81);
        Student st2 = new Student("Iris",76,93);
        Student st3 = new Student("Vivin",76,85);
        Student st4 = new Student("Doris",95,81);
        Student st5 = new Student("Tom",95,92);
       Comparator<Student> cmp = Comparator.
               <Student,Integer>comparing(st->st.getScore1());       
       cmp = cmp.thenComparing(st->st.getScore2()).
               thenComparing(st->st.getName());
       //cmp = cmp.reversed();//大到小
       TreeSet<Student> set = new  TreeSet(cmp);
       set.add(st1);
       set.add(st2);
       set.add(st3);
       set.add(st4);
       set.add(st5);
       System.out.println(set);
    }
    
}
