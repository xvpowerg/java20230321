/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230418.ch9_3_exception3;

/**
 *
 * @author xvpow
 */
public class Ch9_3_2 {

        
    static void testMyRuntimeException(){
           MyRuntimeException rex = 
                   new MyRuntimeException("MyRuntimeException");
           throw rex;
    }
    
    public static void main(String[] args) {
       
            try{
               testMyRuntimeException();
            }catch(MyRuntimeException ex){
                System.out.println(ex);
            }
        
    }
    
}
