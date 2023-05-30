/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20230530.ch21_2_stream2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Student st1 = new Student();
      st1.appendScore(85);
      st1.appendScore(72);
      st1.appendScore(63);
      st1.appendScore(97);
      System.out.println(st1.getScores());
      ArrayList<Integer> sList =  st1.getScores();
      sList.add(77);
      System.out.println(st1.getScores());
      System.out.println(st1.getScoreStream().findFirst());
    }
    
}
