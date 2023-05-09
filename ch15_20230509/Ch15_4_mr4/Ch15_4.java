/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20230509.Ch15_4_mr4;
import java.util.function.Function;
public class Ch15_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Function<String,Integer> fun1 = String::length;
       System.out.println(fun1.apply("ABCD"));
       
       Function<String,Teacher> fun2 = Teacher::new;
       System.out.println(fun2.apply("Lucy"));
    }
    
}
