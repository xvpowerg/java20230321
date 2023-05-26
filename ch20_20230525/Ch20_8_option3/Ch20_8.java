/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230525.Ch20_8_option3;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch20_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Optional<String> op1 =  Optional.ofNullable("Vivin");
      System.out.println(op1.isPresent());
      op1.ifPresent(v->System.out.println(v.length()));
      op1.ifPresentOrElse(v->System.out.println(v), ()->System.out.println("Else!"));
      Optional<String> op2 =  Optional.ofNullable(null);
      String st1 =   op2.orElse("Default");
      System.out.println(st1);
      String st2 = op2.orElseGet(()->"abcdt".toUpperCase());
      System.out.println(st2);      
//      String st3 = op2.orElseThrow();
//      System.out.println(st3);
      String st4 = op2.orElseThrow(IllegalArgumentException::new);
      System.out.println(st4);
      
      
    }
    
}
