/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230615.ch26_5_thread5;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Future;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch26_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        ExecutorService es = Executors.newCachedThreadPool();
        
       Future<Integer> fu =  es.submit(()->{
            System.out.println("等待產生數字中.....");
                TimeUnit.SECONDS.sleep(6);
              Random ran = new Random();  
            return ran.nextInt(100000);
        });
       
       
        int v =  fu.get();
        System.out.println(v);
        es.shutdown();
    }
    
}
