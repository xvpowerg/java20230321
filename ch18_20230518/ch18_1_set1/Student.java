/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20230518.ch18_1_set1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score1;
    private int score2;

    public Student(String name, int score1, int score2) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
    }

    public String getName() {
        return name;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", score1=" + score1 + ", score2=" + score2 + '}';
    }
    
    
}
