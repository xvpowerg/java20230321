/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20230530.ch21_2_stream2;
import java.util.ArrayList;
import java.util.stream.IntStream;
/**
 *
 * @author xvpow
 */
public class Student {
    private ArrayList<Integer> scoreList = new ArrayList();
    
    public void appendScore(int s){
        scoreList.add(s);
    }
    public ArrayList<Integer> getScores(){
        return scoreList;
    }
    
    public IntStream getScoreStream(){
        return scoreList.stream().mapToInt(v->v);
    }
    public String toString(){
        return  this.scoreList.toString();
    }
}
