/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230615.ch26_4_thread4;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.List;
public class Ch26_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       int cpu = Runtime.getRuntime().availableProcessors();
       System.out.println(cpu);
        ExecutorService es = Executors.newFixedThreadPool(cpu);
        for(int i =1;i<=100;i++){
               es.submit(()->{
                System.out.println(Thread.currentThread().getName());
               });
        }
    List<Runnable> list =  es.shutdownNow();
    System.out.println(list);
                
    }
    
}
