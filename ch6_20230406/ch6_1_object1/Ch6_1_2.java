/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20230406.ch6_1_object1;

/**
 *
 * @author xvpow
 */
public class Ch6_1_2 {

    public static void main(String[] args) {
       Student st1 = new Student();
        st1.setName("Iris");
        st1.setAge(27);
        st1.printInfo();
        
       Student st2 = new Student("Lucy",26); 
       st2.printInfo();
    }
    
}
