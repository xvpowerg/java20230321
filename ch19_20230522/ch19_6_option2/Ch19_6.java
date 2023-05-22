/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230522.ch19_6_option2;
import java.util.Optional;

/**
 *
 * @author xvpow
 */
public class Ch19_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Optional<String> value = Optional.empty();
       //Optional.of 不可傳入null
     //  Optional<String> value2 = Optional.of(null);
       //Optional.of 可傳入null
       Optional<String> value3 =  Optional.ofNullable(null);
       Optional<String> op1 =  Optional.ofNullable("Ken");
       //當Optional內容是null時會拋出NoSuchElementException
       System.out.println(op1.get());
       //如果Optional有內容 回傳true
       System.out.println(op1.isPresent());
       
      Optional<String> op2 =  Optional.ofNullable("Lucy");
      op2.ifPresent(v->System.out.println("ifPresent:"+v));
      op2.ifPresentOrElse(v->System.out.println("ifPresentOrElse:"+v),
              ()->{System.out.println("Else");});
    Optional<String> op3 =  Optional.ofNullable(null);                      
      String orElse = op3.orElse("orElse!");
      System.out.println(orElse);
      
      String orElseGet = op3.orElseGet(()->"orElseGet");
      System.out.println(orElseGet);
      //value為null會拋出java.util.NoSuchElementException
      op3.orElseThrow();
      
      
    }
    
}
