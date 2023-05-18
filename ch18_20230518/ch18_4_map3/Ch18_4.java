/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20230518.ch18_4_map3;

import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch18_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();
        map.put("Ken", 100);
        map.put("Vivin", 86);
        map.put("Lucy", 77);

        //Key存在 會呼叫functiuon 回傳值寫入Map
        map.compute("Vivin", (k, v) -> {
            System.out.println(k + ":" + v);
            return 99;
        });
        System.out.println(map);
        //Key存在 不會呼叫functiuon
        map.computeIfAbsent("Vivin", k -> {
            System.out.println(k);
            return 80;
        });
        //Key存在 會呼叫functiuon 回傳值寫入Map
        map.computeIfPresent("Lucy", (k, v) -> {
            System.out.println("computeIfPresent:" + k + ":" + v);
            return v + 11;
        });
        System.out.println(map);

        System.out.println("================================");
        //Key不存在 會呼叫functiuon 參數v為null 回傳值寫入Map 
        map.compute("Ben", (k, v) -> {
            System.out.println(k + ":" + v);
            return 35;
        });
        System.out.println(map);
        //Key不存在 會呼叫functiuon
         map.computeIfAbsent("Tom", k->{System.out.println(k); return 80;});
          System.out.println(map);
//         //Key不存在 不會呼叫functiuon 回傳值寫入Map
         map.computeIfPresent("Iris", (k,v)->{
                System.out.println("computeIfPresent:"+k+":"+v);
             return v+11;});
          System.out.println(map);

    }

}
