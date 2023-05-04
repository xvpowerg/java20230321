/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230504.Ch14_6_lambda3;
import java.util.function.Function;
public class Ch14_6 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Function<String,Integer> f1 = (String st1)->{
            System.out.println("Fun1");
            return st1.length();
        }; 
        System.out.println(f1.apply("ABC"));
         System.out.println("====================");
         
       Function<String,Integer>  f2 =(st2)->Integer.parseInt(st2);
       System.out.println(f2.apply("567"));
         System.out.println("====================");
    }
    
}
