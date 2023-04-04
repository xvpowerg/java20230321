/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20230404.ch5_4_object3;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("Ken");
        t1.setId(25);
        t1.printInfo();
        
        Teacher t2 = new Teacher(15,"Lucy");
        t2.printInfo();
    }
    
}
