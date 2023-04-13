/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20230413.Ch8_2_mod1.t2;
import ch8_20230413.Ch8_2_mod1.PublicTest1;
import ch8_20230413.Ch8_2_mod1.ProtectedTest2;
import ch8_20230413.Ch8_2_mod1.DefaultTest3;
/**
 *
 * @author xvpow
 */
public class Ch8_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PublicTest1 t1 = new PublicTest1();
        ProtectedTest2 pClass = new Test2();
          ProtectedTest2 pClass2 = new ProtectedTest2(3);
          //因為跨package 所以 Default無法讀取
          //DefaultTest3 t3 = new DefaultTest3();
    }
    
}
