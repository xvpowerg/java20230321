/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.m1.beans1;

/**
 *
 * @author xvpow
 */
public class Teacher {
        private String name;
    private int age;
    public Teacher(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
       return name;
    }
    
    public String toString(){
        return "Teacher:"+this.getName()+":"+this.age;
    }
}
