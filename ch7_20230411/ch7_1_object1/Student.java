/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20230411.ch7_1_object1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    //當沒有任何建構式時,會自動補上預設建構式
     Student(){
         
     }
    Student(String name,int age){
        this.name=name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void printInfo(){
        System.out.println(this.name+":"+this.age);
    }
}
