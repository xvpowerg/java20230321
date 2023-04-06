/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20230406.ch6_1_object1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {
    
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Ken");
        p1.setAge(25);
        p1.printInfo();
        Person p2 = new Person("Vivin",25);
        p2.printInfo();
        Person p3 = new Person();
        p3.printInfo();//希望name是空字串
        //希望age是-1
        
    }
    
}
