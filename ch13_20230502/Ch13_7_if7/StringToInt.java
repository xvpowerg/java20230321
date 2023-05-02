/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20230502.Ch13_7_if7;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class StringToInt implements Function<String,Integer> {
    public Integer apply(String value){
        return value.length();
    }
}
