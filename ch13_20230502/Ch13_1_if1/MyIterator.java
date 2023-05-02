/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20230502.Ch13_1_if1;

/**
 *
 * @author xvpow
 */
public interface MyIterator {
    String[] getData();
    default void forEach(){
        for (String v : getData()){
            System.out.println(v);
        }
    }
}
