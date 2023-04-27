/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230427.Ch12_3_abs1;

/**
 *
 * @author xvpow
 */
//因為類別是final無法繼承
//abstract類別不能是final
 final  public  class TestAbs1 {
    //因為方法是final無法複寫
     //abstract方法不能是final
    public final void testFinal(){
        System.out.println("testFinal");
    }
}
