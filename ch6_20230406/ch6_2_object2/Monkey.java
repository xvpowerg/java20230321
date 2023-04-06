/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230406.ch6_2_object2;

/**
 *
 * @author xvpow
 */
public class Monkey  extends Animal{
    public Monkey(String name,float weight){
        super(name,weight);
    }
    public void printInfo(){
        System.out.print("Monkey:");
        super.printInfo();
    }
    
}
