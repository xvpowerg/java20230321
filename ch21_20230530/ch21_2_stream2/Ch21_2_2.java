/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20230530.ch21_2_stream2;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
/**
 *
 * @author xvpow
 */
public class Ch21_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Student st1 = new Student();
         Student st2 = new Student();
         Student st3 = new Student();
         ArrayList<Student> list = new ArrayList();
         list.add(st1);
         list.add(st2);
         list.add(st3);
         
        st1.appendScore(85);
        st1.appendScore(72);
        st1.appendScore(63);
        st1.appendScore(97);
        
        st2.appendScore(96);
        st2.appendScore(87);
        st2.appendScore(55);
        st2.appendScore(76);
        
        st3.appendScore(77);
        st3.appendScore(88);
        st3.appendScore(62);
        st3.appendScore(21);
        
       // list.forEach(v->System.out.println(v));
      IntSummaryStatistics iss =  list.stream().
               flatMapToInt(st->st.getScoreStream()).
               summaryStatistics();
      System.out.println(iss.getMax());
      System.out.println(iss.getSum());
      System.out.println(iss.getAverage());
    }
    
}
