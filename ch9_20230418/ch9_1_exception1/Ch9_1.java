/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230418.ch9_1_exception1;

/**
 *
 * @author xvpow
 */
public class Ch9_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test1 t1 = new Test1();
        //因為函式定義了拋例外(throws Exception) 所以必須try 或拋出
        //try {}只要有例外就會傳到catch()
        try{
            t1.testException(true);
             System.out.println("End 1!!"); 
        }catch(Exception ex){
            System.out.println(ex);
        }
        
       
        System.out.println("End 2!!");
    }
    
}
