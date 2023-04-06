/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230406.ch6_2_object2;

/**
 *
 * @author xvpow
 */
public class Cat extends Animal {
    Cat(){
        
    }
    Cat(String name,float weight){
        super(name,weight);
    }
    @Override
    public void  printInfo(){
        System.out.print("Cat:");
        super.printInfo();
    }
}
