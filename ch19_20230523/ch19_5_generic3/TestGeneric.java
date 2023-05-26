/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20230523.ch19_5_generic3;
import java.util.function.Supplier;
import java.util.function.Function;
public class TestGeneric {
    public <T> T testGen(T v){
        return v;
    }
    
    public <T> T getData(Supplier<T> s){
        return s.get();
    }
    
    public <T extends Exception> T getException(Supplier<T>ex){    
        return ex.get();
    }
    
    public static <T,R> R map(T data,Function<T,R> fun){
        return fun.apply(data);
    }
}
