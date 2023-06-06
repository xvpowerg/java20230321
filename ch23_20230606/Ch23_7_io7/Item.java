/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20230606.Ch23_7_io7;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Item extends Product implements Serializable{
    private String name;
    private int price;

    public Item(String name, String location,int price) {
        super(location);
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + super.toString()+'}';
    }
    
}
