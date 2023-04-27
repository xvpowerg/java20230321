/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230427.Ch12_5_if2;

/**
 *
 * @author xvpow
 */
public class Person implements Jump,Run {
    private String name;
    Person(String name){
        this.name = name;
    }
    public void jumping(){
        System.out.println(name+" Person跳");
    }
    
    public void runing(){
        System.out.println(name+" Person跑");
    }
}
