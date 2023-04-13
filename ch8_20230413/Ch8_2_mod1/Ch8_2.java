/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230413.Ch8_2_mod1;
/**
 *
 * @author xvpow
 */
public class Ch8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PublicTest1 t1 = new PublicTest1();
        ProtectedTest2 p  = new ProtectedTest2();
        DefaultTest3 dfT3 = new DefaultTest3();
        
        //PrivateTest4 prT4 = new PrivateTest4();
        PrivateTest4.newStyle1();
    }
    
}
