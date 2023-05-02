/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20230502.Ch13_7_if7;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Add5 implements UnaryOperator<Integer>{
    public Integer apply(Integer v){
        return v + 5;
    }
}
