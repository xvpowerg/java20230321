/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20230606.Ch23_7_io7;

/**
 *
 * @author xvpow
 */
public class Product {
    private String loca;
    public Product(String loca){
        this.loca = loca;
    }
   public Product(){
       this("Empty");
    }
    @Override
    public String toString() {
        return " loca=" + loca ;
    }
    
    
}
