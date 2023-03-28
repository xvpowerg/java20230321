/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20230328;
import java.util.Arrays;
public class Ch3_3 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1 = {5,8,11,3,6};
        Arrays.sort(array1);
        for (int v : array1){
            System.out.print(v+" ");
        }
        System.out.println();
        
        int sIndex = Arrays.binarySearch(array1, 6);
        System.out.println(sIndex);
        //找不到
        //小於所有:-1
        int index2 = Arrays.binarySearch(array1, 2);
        System.out.println(index2);
        //大於所有-6 (長度 + 1) * -1
         int index3 =  Arrays.binarySearch(array1, 15);
         System.out.println(index3);
        //在中間靠近7數值比較大的(index + 1)*-1
        int index4 = Arrays.binarySearch(array1, 7);
        System.out.println(index4);
    }
    
}

