/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230406.ch6_2_object2;

/**
 *
 * @author xvpow
 */
public class Dog extends Animal {
    Dog(){        
    }
    Dog(String name,float weight){
        super(name,weight);     
    }
   //override(複寫)
    //  @Override 檢查複寫是否正確
      @Override
    public void printInfo(){
        System.out.print("Dog:");
        //super. 呼叫父類別的xxx
        super.printInfo();
    }
}
