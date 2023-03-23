/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {

    /**
     * @param args the command line arguments
     */
    
    static int step1(){
        System.out.println("step1");        
        return 1;
    }
    static boolean step2(){
        System.out.println("step2");        
        return true;
    }
    
    static void step3(){
         System.out.println("step3");      
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
//        for (int i =1,k = 10  ;i <= 5 && k >=6 ; i++,k-- ){
//            System.out.println(i+":"+k);
//        }

        for (int i = 1,k = step1(); i <= 3 && step2();i++,step3()){
            System.out.println("step4");
        }

        //step1
        //step2
        //step4
        //step3
        //step2
        //step4
        //step3
        //step2
        //step4
        //step3
        //
    }
    
}
