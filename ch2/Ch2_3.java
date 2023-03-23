/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2;

/**
 *
 * @author xvpow
 */
public class Ch2_3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int[] arra1 = new int[5];      
       int arra2[] = new int[5];       
       
       int[] arra3 = {5,6,7,8};//只可用宣告時
       for (int v : arra3){
           System.out.print(v+" ");
       }
         System.out.println();
         //[]不可填長度
      int[] arra4 = new int[]{100,200,300,600};
      
      int[] arra5 = new int[3];
      arra5[0]= 1;
      arra5[1]= 8;
      arra5[2]= 7;
      
      for(int v : arra5){
          System.out.print(v+" ");
      }
      System.out.println();
      System.out.println("==================");
      
      arra5 = new int[]{11,12,9,6,7};
      
      for(int v : arra5){
          System.out.print(v);
      }
      System.out.println();
    }
    
}
