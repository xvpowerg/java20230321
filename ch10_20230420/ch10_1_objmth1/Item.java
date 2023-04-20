/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20230420.ch10_1_objmth1;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    
    public String toString(){
        return getName()+":"+getPrice();
    }
    
    public boolean equals(Object obj){
        //obj instanceof Item  問obj是否為一個Item 如果是Item回傳true
        if (obj instanceof Item == false){
            return false;
        }
//        if (obj.getClass().getName() != Item.class.getName()){
//             return false;
//        }
      Item tmp =   (Item)obj;
      return this.price == tmp.price && 
              this.name.equals(tmp.name);
    }
    
    
}
