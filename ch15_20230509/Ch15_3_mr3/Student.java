/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20230509.Ch15_3_mr3;
import java.util.function.Predicate;
public class Student {
    private String name;
    private int nameLen = 3; 
    Student(String name,int nameLen){
        this.name = name;
        this.nameLen = nameLen;
    }
    
    public boolean defaultTestName(String name){
        if (name.length() > nameLen){
            return true;
        }
         return false;
    }
    public boolean checkNameInfo(Predicate<String> p){
        if (p == null){
            p = this::defaultTestName;
        }
      return  p.test(name);       
    }
    
    
}
