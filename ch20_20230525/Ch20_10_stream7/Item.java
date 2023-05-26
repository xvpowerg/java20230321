/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20230525.Ch20_10_stream7;

/**
 *
 * @author xvpow
 */
public class Item {
    private String value;
    private int len;

    public Item(String value, int len) {
        this.value = value;
        this.len = len;
    }

    public int getLen() {
        return len;
    }
    
    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", len=" + len + '}';
    }
    
}
