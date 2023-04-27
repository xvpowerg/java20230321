/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230427.Ch12_2_Report;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */

public class Employee {
    private String name;
    private ArrayList<Integer> scores;

    public Employee(){
        scores = new ArrayList<>();
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void appendScore(int score){       
        scores.add(score);
    }
    
    public int sum(){
        int sum = 0;
        for(int s : scores){
            sum += s;
        }
        return sum;
    }
    
    public float avg(){
        return sum()/scores.size();
    }
    
    
    public String toString(){
        return this.name+":"+" Sum:"+this.sum()+" Avg:"+this.avg();
    }
}
