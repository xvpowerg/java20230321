/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20230427.Ch12_6_if3;

/**
 *
 * @author xvpow
 */
public class Ch12_6 {

    
    
    static void runIronMan(IronMan man){
        man.attacking(10);
        man.flying();
        man.jumping();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        IronMan man = new IronMan();
        runIronMan(man);
    }
    
}
