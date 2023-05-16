/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20230516.Ch17_2_set2;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    
    public Item(String name,int price){
        this.name = name;
        this.price = price;                
    }
    
    public String toString(){
        return this.name+":"+this.price;
    }
    
    public boolean equals(Object obj){
        System.out.println("equals:"+obj);
        if (obj == null || obj instanceof Item == false){
            return false;
        }
        Item tmpItem = (Item)obj;
        return this.price == tmpItem.price &&
                this.name.equals(tmpItem.name);
    }
    
    public int hashCode(){
        System.out.println("hashCode:"+this);
        return this.price+this.name.hashCode();
    }        
}
