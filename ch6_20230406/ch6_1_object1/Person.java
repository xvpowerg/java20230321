/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230406.ch6_1_object1;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    Person(){       
        //this()只能用在建構式 表示呼叫另一組建構式
        //this() 只能是第一行命令
       this("",-1);
    }
     Person(String name){
        this(name,-1);    
    }
    
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    

    public void setName(String name){
        //this. 目前物件的.....
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){        
        this.age = age;        
    }
    
    public int getAge(){
        return age;
    }
    public void printInfo(){       
        System.out.println(getName()+":"+getAge());
    }
    
    private void test(){
        
    }
}
