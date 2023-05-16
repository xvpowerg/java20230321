/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20230516.Ch17_5_set5;

/**
 *
 * @author xvpow
 */
public class Product {
    private String name;
    private String location;
    private int price;
    Product(String name,String location,int price){
        this.name = name;
        this.price = price;
        this.location = location;
    }
    
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getLocation(){
        return this.location;
    }
    
    public String toString(){
        return this.getName()+":"+
                this.getLocation()+":"+this.getPrice();
    }
}
