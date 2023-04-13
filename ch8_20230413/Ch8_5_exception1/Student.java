/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230413.Ch8_5_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    
    public void setAge(int age){
        //限制 age 如果小於0大於300就顯示錯誤的年齡
//        if (age < 0 || age > 300){
//            System.out.println("錯誤的年齡");
//            return;
//        }

        if (age < 0 || age > 300){
            throw new RuntimeException("錯誤的年齡");
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    
    public void printInfo(){
        System.out.println(this.getAge());
    }
}
