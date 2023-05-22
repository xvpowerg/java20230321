/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20230522.ch19_1_generic1;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class TestGeneric {
    public static <T extends Exception> T genException(Supplier<T> s){
        return s.get();
    }
    
    public static <T> void foreach(List<T> list,Consumer<T> c){
        list.forEach(c);
    }
}
