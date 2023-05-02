/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230502.Ch13_1_if1;
/**
 *
 * @author xvpow
 */
public class Ch13_1 {

     
    static void printData(MyIterator it){
        it.forEach();
    }
    public static void main(String[] args) {
     Student st1 = new Student("Ken",18);
     st1.appendScore(80);
     st1.appendScore(75);
     st1.appendScore(96);
     printData(st1);
     
     System.out.println("Max:"+MyCompare.max(25, 71));
        
    }
    
}
