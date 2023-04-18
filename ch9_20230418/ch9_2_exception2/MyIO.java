/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20230418.ch9_2_exception2;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class MyIO {
    public void copy() throws IOException{
        
        throw new IOException();
    }
    
    public void close(){
        System.out.println("close IO");
    }
}
