/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m2.main;
import tw.com.m2.tools.MyClass;
import tw.com.m1.beans1.Student;
/**
 *
 * @author xvpow
 */
public class TestMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass mc = new MyClass();
        Student st = mc.getStudent();
        System.out.println(st);
        
    }
    
}
