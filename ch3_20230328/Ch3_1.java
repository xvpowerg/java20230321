/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230328;

/**
 *
 * @author xvpow
 */
public class Ch3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] myArray = new int[2][];
        myArray[0] = new int[5];
        myArray[0][2] = 75;
        //myArray[0][5] = 83;// java.lang.ArrayIndexOutOfBoundsException
        myArray[1][2] = 35;//java.lang.NullPointerException
        
        
    }
    
}
