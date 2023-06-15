/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230615.ch26_3_thread3;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
/**
 *
 * @author xvpow
 */
public class Ch26_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ExecutorService ex = Executors.newCachedThreadPool();
        for (int i =1;i<=100;i++){
               ex.submit(()->{
                   
                   System.out.println(Thread.currentThread().getName());                   
        
                });
        }
     ex.shutdown();
    }
    
}
