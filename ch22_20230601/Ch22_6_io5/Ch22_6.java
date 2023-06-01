/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20230601.Ch22_6_io5;

/**
 *
 * @author xvpow
 */
public class Ch22_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try(TestClose c1 = new TestClose("TestClose1");
            TestClose c2 = new TestClose("TestClose2",true);     
                ){
          System.out.println("Body!!");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
