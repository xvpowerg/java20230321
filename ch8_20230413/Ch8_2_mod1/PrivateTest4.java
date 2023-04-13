/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20230413.Ch8_2_mod1;

/**
 *
 * @author xvpow
 */
public class PrivateTest4 {
    private String style;
    //私有建構式 限定無法在其他類別使用建構式 建立物件
    private PrivateTest4(String style){
        this.style = style;
        System.out.println("PrivateTest4!!:"+style);
    }
    
    public static PrivateTest4  newStyle1(){
        
        return new PrivateTest4("Style1");
    }
    
}
