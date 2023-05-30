/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20230530.ch21_5_stream5;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch21_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList();
       list.add("Ken");
       list.add("Vivin");
       list.add("Lucy");
       list.add("Joy");
       list.add("Iris");
        
        HashMap<Integer,List<String>> group = new HashMap();
        for (String v : list){
            List<String> tmpData = new ArrayList<>();
            tmpData.add(v);
            group.merge(v.length(), tmpData, (v1,v2)->{                
                      v1.addAll(v2);
                    return v1;
            });            
        }        
        System.out.println(group);
        
       Map<Integer,String>  map1 = list.stream().collect(Collectors.
                toMap(v->v.length(),
                        v->v,
                        (ov,nv)->ov+","+nv));
       System.out.println(map1);
        
    }
    
}
