/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20230404.ch5_2_object1;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {
    
    public static void main(String[] args) {
       
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Ken";
        s1.age = 18;
        s1.printInfo();
        //System.out.println(s1.name+":"+s1.age);
        s2.name = "vivin";
        s2.age = 20;
        s2.printInfo();
        //name :vivin
        //age: 20
        //System.out.println(s2.name+":"+s2.age);
    }
    
}
