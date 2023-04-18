/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20230418.ch9_4_override1;

/**
 *
 * @author xvpow
 */
public class MainException extends Exception {
  public  MainException(){
        this("MainException");
    }
   public  MainException(String msg){
        super(msg);
    }
}
