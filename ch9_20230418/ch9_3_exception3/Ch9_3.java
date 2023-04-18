/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230418.ch9_3_exception3;

/**
 *
 * @author xvpow
 */
public class Ch9_3 {
    static void testMyException(String msg)throws MyException{
        throw new MyException(msg);
    }
    public static void main(String[] args) {
       
        try{
            testMyException("MyException");
        }catch(MyException ex){
            System.out.println(ex);
        }
        
        
    }
    
}
