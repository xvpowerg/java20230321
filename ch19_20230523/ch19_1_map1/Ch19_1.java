/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230523.ch19_1_map1;

import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch19_1 {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList();
      Random ran = new Random();
      HashMap<Integer,Integer> geoupMap = new HashMap();
      for (int i = 1; i <= 200;i++){
          int n = ran.nextInt(50)+1;
          list.add(n);
      }
      //System.out.println(list);
//      for (int key : list){
//          int count = 0;
//          if (geoupMap.containsKey(key)){
//              count = geoupMap.get(key);
//          }
//          count++;
//          geoupMap.put(key, count);
//      }
      
//        for (int key : list){         
//           geoupMap.computeIfPresent(key, (k,v)->v+1);
//           geoupMap.computeIfAbsent(key, k->1);          
//        }

        for (int key : list){
          geoupMap.merge(key, 1, (v1,v2)->v1+1);
        }
      System.out.println(geoupMap);
    }
    
}
