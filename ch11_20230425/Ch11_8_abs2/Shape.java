/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230425.Ch11_8_abs2;

/**
 *
 * @author xvpow
 */
//只有抽象方法類別一定是抽象類別
//
public abstract class Shape {
    private String name;
    public  Shape(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public abstract float area(float ... values);
}
