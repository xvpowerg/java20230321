/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20230523.ch19_2_map2;

/**
 *
 * @author xvpow
 */
public class Item {
    private int price;
    private String name;

    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" + "price=" + price + '}';
    }
    
}
