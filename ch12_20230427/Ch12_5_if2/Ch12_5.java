/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20230427.Ch12_5_if2;

/**
 *
 * @author xvpow
 */
public class Ch12_5 {
    
    static void testJump(Jump jump){
        jump.jumping();
    }
    static void testRun(Run run){
        run.runing();
    }
    public static void main(String[] args) {
        Person p1 = new Person("Ken");
        testJump(p1);
        testRun(p1);
    }
    
}
