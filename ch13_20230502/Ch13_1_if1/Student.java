/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20230502.Ch13_1_if1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Student implements MyIterator {
    private String name;
    private int age;
    private ArrayList<Integer> scoreList = new ArrayList();
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public void appendScore(int score){
        scoreList.add(score);
    }
    
    public String[] getData(){
        String[] data = new String[scoreList.size() + 1];
        data[0] = name;
        for (int i = 0; i <scoreList.size() ;i++){
            data[i+1] = scoreList.get(i)+"";
        }
        return data;
    }
}
