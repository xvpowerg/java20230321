/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230418.ch9_1_exception1;

/**
 *
 * @author xvpow
 */
public class Ch9_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1();
        try{
           t1.testRuntimeException(true);     
           System.out.println("End 1");
        }catch(RuntimeException ex){
            System.out.println(ex);
        }
     
       System.out.println("End 2");
    }
    
}
