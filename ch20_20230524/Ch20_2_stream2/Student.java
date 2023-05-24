/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20230524.Ch20_2_stream2;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Student {
    private List<Integer> scores = new ArrayList();
    public void addScore(int score){
        scores.add(score);
    }
    public List<Integer> getScore(){
        return this.scores;
    }
    
    public Stream<Integer> getScoreStream(){
        return this.scores.stream();
    }
}
