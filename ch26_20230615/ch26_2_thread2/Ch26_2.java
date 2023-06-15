/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230615.ch26_2_thread2;

/**
 *
 * @author xvpow
 */
public class Ch26_2 {

    static class Test{
        int x =0;
        public synchronized void print(){
          
            for (int i =1; i <=  10;i++){
                System.out.println(Thread.currentThread().getName());
                x++;
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
       Test t1 = new Test();
        Thread th1 = new Thread(()->t1.print());
       Thread th2 = new Thread(()->t1.print());  
        th1.start();
        th2.start();
    }
    
}
