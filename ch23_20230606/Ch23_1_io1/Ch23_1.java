/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230606.Ch23_1_io1;

/**
 *
 * @author xvpow
 */
public class Ch23_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(TestClose t1 = new TestClose("T1",true);
           TestClose t2 = new TestClose("T2",true)){
            
            System.out.println("Body!!");
            throw new Exception("Body Ex");
        }catch(Exception ex){
            System.out.println(ex);
           Throwable[] thArray =   ex.getSuppressed();
           for (Throwable th :  thArray){
               System.out.println(th);
           }
        }
    }
    
}
