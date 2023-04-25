/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230425.Ch11_7_abs1;

/**
 *
 * @author xvpow
 */
public abstract class Animal {
    private String name;
    private int age;
    
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    
    public String toString(){
        return this.getName() +":"+this.getAge();
    }
}
