/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20230427.Ch12_2_Report;
import ch12_20230427.Ch12_1_Erp1.Erp;
/**
 *
 * @author xvpow
 */
public class Ch12_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String msg = "Ken,100,60,70";
//        String[] data =   msg.split(",");
//        System.out.println(data[0]);
//        System.out.println(data[1]);
//        System.out.println(data[2]);
        
        Erp erp = new MyReport();        
        erp.exportReport();
        
    }
    
}
