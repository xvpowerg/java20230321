/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230418.ch9_4_override1;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test2();
        try{
            t1.testEx1();
        }catch(MainException ex){
            System.out.println(ex);
        }
        
    }
    
}
