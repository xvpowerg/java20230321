/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m1.main;
import tw.com.m1.beans1.Student;
import tw.com.m1.beans1.Teacher;
import tw.com.m1.beans2.Car;
/**
 *
 * @author xvpow
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("Ken",12);
       System.out.println(st1);
       Teacher t2 = new Teacher("Iris",25);
       System.out.println(t2);
       Car car1 = new Car("BMW",4);
       System.out.println(car1);
       
    }
    
}
