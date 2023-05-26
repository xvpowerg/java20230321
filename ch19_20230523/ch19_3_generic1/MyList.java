/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20230523.ch19_3_generic1;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class MyList<T> {
    private ArrayList<T> list = new ArrayList();
    public T get(int index){
        return list.get(index);
    }
    public void add(T v){
        list.add(v);
    }
    
    public void foreach(Consumer<T> c){
        list.forEach(c);
    }
}
