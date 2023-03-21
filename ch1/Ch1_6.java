/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        String name = "Ken";        
        if (name.equalsIgnoreCase("Ken") ){
            System.out.println("PM");
        }else if(name.equalsIgnoreCase("Iris") ){
            System.out.println("RD");           
        }else if(name.equalsIgnoreCase("Lucy") ){
            System.out.println("HR");                       
        }else{
            System.out.println("Error");                       
        }
        
        //Ken 顯示 PM
        //Iris 顯示RD
        //Lucy 顯示HR
        //Error!
    }
    
}
