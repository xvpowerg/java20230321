/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230518.ch18_3_map2;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch18_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap();
         map.put("Ken",100 );
         map.put("Vivin",86 );
         map.put("Lucy",77 );
         map.merge("Vivin", 20, (v1,v2)->{
             //v1是map內的value v2 merge的value
             //回傳可寫入Map
             System.out.println(v1+":"+v2);
             
             return v1+v2;
         });
         System.out.println(map);
         //key不存在 新增資料於map
         map.merge("Tom", 88, (v1,v2)->{
             System.out.println(v1+":"+v2);
             return v2;
         });
          System.out.println(map);
    }
    
}
