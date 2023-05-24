/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230524.Ch20_2_stream2;
import java.util.List;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;

/**
 *
 * @author xvpow
 */
public class Ch20_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student();
      st1.addScore(82);
      st1.addScore(65);
      st1.addScore(33);
      st1.addScore(71);      
      
      Student st2 = new Student();
      st2.addScore(52);
      st2.addScore(77);
      st2.addScore(65);
      st2.addScore(83); 
      
      
      Student st3 = new Student();
      st3.addScore(99);
      st3.addScore(71);
      st3.addScore(45);
      st3.addScore(69); 
      
      ArrayList<Student> stList = new ArrayList<>();
      stList.add(st1);
      stList.add(st2);
      stList.add(st3);
      stList.stream().flatMap(st->st.getScoreStream()).forEach(
              sc->System.out.println(sc));
       System.out.println("========================================");
      IntSummaryStatistics intSummer =  stList.stream().flatMapToInt(
               st->st.getScoreStream().mapToInt(sc->sc)).
               summaryStatistics();
      System.out.println(String.format("%.2f", intSummer.getAverage()) );
      System.out.println(intSummer.getMax());
      System.out.println(intSummer.getMin());
//      st1.getScore().forEach(v->System.out.println(v));
//      List<Integer> scoreList = st1.getScore();
//      System.out.println("========================================");
//      scoreList.add(99);
//      st1.getScore().forEach(v->System.out.println(v));
//      System.out.println("========================================");
//      st1.getScoreStream().forEach(v->System.out.println(v));
      
      
    }
    
}
