/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20230511.ch16_5_collection3;

/**
 *
 * @author xvpow
 */
public class Item {
    private int id;
    private String name;
    Item(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    public  String toString(){
        return id+":"+name;
    }
    
    public boolean equals(Object obj){
        if (obj == null || obj instanceof Item == false ){
            return false;
        }
        Item tmpItem = (Item)obj;
        return this.id == tmpItem.id &&
                this.name.equals(tmpItem.name);
    }
}
