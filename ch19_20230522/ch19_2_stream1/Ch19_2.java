/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230522.ch19_2_stream1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(25);
        list.add(31);
        list.add(42);
        list.add(88);
        list.add(65);
        list.add(93);
        //只顯示偶數
//        for (int v : list){
//            if (v % 2 == 0){
//                System.out.println(v);
//            }
//        }
       list.stream().filter(v->v%2 == 0).forEach(v->System.out.println(v));
    }
    
}
