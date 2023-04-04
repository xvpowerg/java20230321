/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20230404.ch5_4_object3;

/**
 *
 * @author xvpow
 */
public class Teacher {
    private int id;
    private String name;
    Teacher(){  
    }
    Teacher(int inId,String inName){
        id = inId;
        name = inName;
    }
    public void setId(int inId){
        id = inId;
    }
    public int getId(){
        return id;
    }
    public void setName(String inName){
        name = inName;
    }
    
    public String getName(){
        return name;
    }
    
    public void printInfo(){
        System.out.println(id+":"+name);
    }
    
}
