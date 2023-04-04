/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20230404.ch5_3_object2;

/**
 *
 * @author xvpow
 */
public class Employee {
   private String name;
    int salary;
   private float height;
    
   public void setName(String inName){
       if (inName == null || inName.length() < 2 || inName.length() > 50 ){
           System.out.println("錯誤的name");
           return;
       }
       name= inName;
   }
   public String getName(){
       return name;
   }
   public void setHeight(float inHeight){
       
       if (inHeight < 10 || inHeight > 500){
           System.out.println("錯誤的身高");
            return;   
       }
       height = inHeight;
   }
   public float getHeight(){
       return height;
   }
    void printInfo(){
        System.out.println(getName()+":"+salary+":"+getHeight());
    }
}
