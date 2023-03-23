/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2;

/**
 *
 * @author xvpow
 */
public class Ch2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //多維
            //左邊[]總數 等於 右邊的[]數量
            int[][] array2x3 = new int[2][3];
            int[] array2x3_2[] = new int[2][3];
            int array2x3_3[][] = new int[2][3];
            
            int[][] array2x3_4 = { {1,2,3},
                                   {4,5,6}};
            for (int[] tmpA : array2x3_4){
                for (int v : tmpA){
                    System.out.print(v+" ");
                }
                System.out.println();
            }
            System.out.println("====================");
            int[][] array2xN_5 = new int[2][];
            array2xN_5[0] = new int[]{5,6,8};
            array2xN_5[1] = new int[]{7,5,1,36};
            for (int[] tmA : array2xN_5){
                for (int v : tmA){
                    System.out.print(v+" ");
                }
                 System.out.println();
            }
    }
    
}
