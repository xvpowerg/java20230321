/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230504.Ch14_5_lambda2;

/**
 *
 * @author xvpow
 */
public class Ch14_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestIF2 t1 = (String v)->{
                    System.out.println("T1:"+v);};
        t1.test2("Show Test1!");
        
       TestIF2 t2 = (v) ->System.out.println("T2:"+v);
       t2.test2("Test2");
       
       TestIF2 t3 = v->System.out.println("T3:"+v);
       t3.test2("Test3");      
    }
    
}
