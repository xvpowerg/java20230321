/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230427.Ch12_6_if3;

/**
 *
 * @author xvpow
 */
public class IronMan implements IronManIF {
    public void attacking(int power){
        System.out.println("IronMan:"+power);
    }
    
    public void flying(){
                System.out.println("IronMan: Fly:"+Fly.MAX_SPEED);
    }
    public void jumping(){
        System.out.println("IronMan: jump");
    }
}
