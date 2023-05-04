/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20230504.Ch14_1_if1;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class TestStringLen implements Predicate<String>{
    private int cmpNumber = 3;
    TestStringLen(){}
    TestStringLen(int number){
        cmpNumber = number;
    }
    public boolean test(String str){
        if (str.length() > cmpNumber){
            return true;
        }
        return false;
    }
}
