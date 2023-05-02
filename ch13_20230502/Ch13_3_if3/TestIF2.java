/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20230502.Ch13_3_if3;

/**
 *
 * @author xvpow
 */
public interface TestIF2  extends TestIF1{
    default void showData(){
        System.out.println("TestIF2 showData");
    }
}
