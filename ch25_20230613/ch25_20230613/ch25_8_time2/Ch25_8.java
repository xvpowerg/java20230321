/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230613.ch25_8_time2;
import java.time.LocalTime;
/**
 *
 * @author xvpow
 */
public class Ch25_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime time518 = LocalTime.of(5, 18);
        System.out.println(time518);
        
        System.out.println(now.isAfter(time518));
        
        System.out.println(now.getHour());
    }
    
}
