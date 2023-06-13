/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230613.ch25_7_time1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author xvpow
 */
public class Ch25_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       LocalDate now = LocalDate.now();
       System.out.println(now);
       LocalDate date610 = LocalDate.of(2023, 6, 10);
        System.out.println(date610);
       // date610.isLeapYear() //是否為閏年
        System.out.println(now.minusDays(2));  
        System.out.println(now.minusDays(15));  
        System.out.println(now.isAfter(date610));
        
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
        
    }
    
}
