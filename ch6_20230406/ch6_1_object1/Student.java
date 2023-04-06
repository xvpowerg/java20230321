/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230406.ch6_1_object1;

/**
 *
 * @author xvpow
 */
//類別只能單一繼承
//能由父類繼承什麼?
//能在其他類別使用到的方法
//能在其他類別使用到的屬性
public class Student extends Person{
    Student(){        
    }
    Student(String name,int age){
        //呼叫父類別建構式super()
        //super() 只能在建構式呼叫
        //super() 只能是第一行命令       
        super(name,age);
//        this.setName(name);
//        this.setAge(age);
    }
    
}
