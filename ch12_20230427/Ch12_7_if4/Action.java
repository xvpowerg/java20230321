/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch12_20230427.Ch12_7_if4;

/**
 *
 * @author xvpow
 */
public interface Action {
    void action();
    //非靜態的interface 方法
    //用來呼叫抽象的方法
    default  void run(){
        action();
    }
}
