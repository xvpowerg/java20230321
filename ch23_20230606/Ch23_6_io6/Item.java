/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20230606.Ch23_6_io6;
import java.io.Serializable;
/**
 *
 * @author xvpow
 */
public class Item implements Serializable{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + '}';
    }
    
}
