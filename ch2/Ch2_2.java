/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] scores = new int[5];
        scores[1] = 9;
        scores[3] = 8;
        
        for (int i = 0; i < scores.length;i++){
            System.out.print(scores[i]+" ");
        }
        System.out.println();
        
//        for (int i = 0; i < 5;i++){
//             int v  = scores[i];
//            System.out.print(v+" ");
//        }
        //foreach
        for (int v : scores){
            System.out.print(v+"");
        }
        System.out.println();
        
        Arrays.stream(scores).forEach(System.out::println);
    }
    
}
