/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2;

/**
 *
 * @author xvpow
 */


public class Ch2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array2x3 = new int[2][3];
        array2x3[0][0] = 35;
        array2x3[0][2] = 71;
        array2x3[1][1] = 16;
        array2x3[1][2] = 52;
        
        for (int i = 0; i < array2x3.length; i++){
            for (int k = 0; k < array2x3[i].length;k++){
                System.out.print(array2x3[i][k]+" ");
            }
             System.out.println();
        }
         System.out.println();
          System.out.println("===================");
          
        //使用foreach
        for (int i = 0; i <array2x3.length ;i++){
            int[] tmpArr = array2x3[i];
            for (int k = 0; k < tmpArr.length;k++){
                int v = tmpArr[k];
                System.out.print(v+" ");
            }
             System.out.println();
        }
         System.out.println("======================");
        
         
        for (int[] tmpArr : array2x3){
            for (int v : tmpArr){
                System.out.print(v+" ");
            }
              System.out.println();
        }       
         
    }
    
}
