/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230425.Ch11_8_abs2;

/**
 *
 * @author xvpow
 */
public  class Rectangle  extends Shape{
        
    Rectangle(){
        super("Rectangle");
    }
    
     public  float area(float ... values){
         if (values.length < 2){
             throw new IllegalArgumentException("錯誤的參數必須提供長寬");
         }
         return values[0] * values[1];
     }
}
