/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20230516.Ch17_4_set4;

/**
 *
 * @author xvpow
 */
public class Student implements Comparable<Student> {
    private String name;
    private int score;
    Student(String name,int score){
        this.name = name;
        this.score = score;
    }
    
    /*
     回傳正數 目前物件大於傳入物件
     回傳負數 目前物件小於傳入物件
     回傳0 目前物件等於傳入物件
    */
    
    public int compareTo(Student st){
            if (this.score > st.score ){
                return 1;
            }else if(this.score < st.score){
                return -1;
            }
        return this.name.compareTo(st.name);
    }
    
    public String toString(){
        return name+":"+score;
    }
    
}
