/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230518.ch18_2_map1;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch18_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Key        Value
        //身份證    人
        //地址     一群人
        
         HashMap<String,Integer> map = new HashMap();
         map.put("Ken",100 );
         map.put("Vivin",86 );
         map.put("Lucy",77 );
         //key重複 覆蓋於map
         map.put("Ken",93 );
         
         System.out.println(map.get("Ken"));
         
         for (String key : map.keySet()){
             System.out.println(key+":"+map.get(key));
         }
          System.out.println("======================");
          map.forEach((k,v)->System.out.println(k+":"+v));
          
         System.out.println(map.containsKey("Vivin"));
         System.out.println(map.containsKey("Tom"));
         
         System.out.println(map.get("Tom"));
         int value = 79;
         String key = "Tom";
         //Key存在就不寫入79
//         if (!map.containsKey(key)){
//            map.put(key, value);
//         }
//         System.out.println(map);
         map.putIfAbsent(key, value);
         System.out.println(map);          
         System.out.println(map.getOrDefault("Ben", -1));
          
    }
    
}
