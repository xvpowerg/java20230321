/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20230427.Ch12_4_if1;

/**
 *
 * @author xvpow
 */
public class Ch12_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fly myFly = new AirPlan();
        myFly.flying();
        myFly = new Bird();
        myFly.flying();
    }
    
}
