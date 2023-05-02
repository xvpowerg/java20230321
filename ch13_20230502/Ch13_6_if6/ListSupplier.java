/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20230502.Ch13_6_if6;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class ListSupplier implements Supplier<List<String>> {
    public List<String> get(){
        return new LinkedList<>();
    }
}
