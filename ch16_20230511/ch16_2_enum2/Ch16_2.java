/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230511.ch16_2_enum2;

/**
 *
 * @author xvpow
 */
public class Ch16_2 {
    static enum Status{
        CONFIRMED,
        REJECT
    }
        
    public static void main(String[] args) {        
        System.out.println(Status.CONFIRMED.getClass());
        System.out.println(Status.REJECT.getClass());
        
      Status c =  Status.valueOf("CONFIRMED");
      System.out.println(c);
      //No enum constant
      //Status.valueOf("");
      System.out.println("==========================");
      Status[] stArray = Status.values();
      for (Status st : stArray){
          System.out.println(st);
      }
    System.out.println("==========================");   
      System.out.println(Status.CONFIRMED.name());
      System.out.println(Status.CONFIRMED.ordinal());
       System.out.println(Status.REJECT.ordinal());
    }
    
}
