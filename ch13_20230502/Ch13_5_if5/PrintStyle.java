/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20230502.Ch13_5_if5;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class PrintStyle  implements Consumer<String> {
    public void accept(String st){
        System.out.print(st+" ");
    }
}
