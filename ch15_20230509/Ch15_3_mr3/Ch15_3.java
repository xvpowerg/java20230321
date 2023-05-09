/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20230509.Ch15_3_mr3;

/**
 *
 * @author xvpow
 */
public class Ch15_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("Iris",3);
     System.out.println(st1.checkNameInfo(null));
      Student st2 = new Student("Ken",3);
     System.out.println(st2.checkNameInfo(st2::defaultTestName));
    }
    
}
