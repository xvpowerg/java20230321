/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230518.ch18_5_map4;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch18_5 {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList();
      Random ran = new Random();
      for (int i = 1; i <= 200;i++){
          int n = ran.nextInt(50)+1;
          list.add(n);
      }
      System.out.println(list);
    }
    
}
