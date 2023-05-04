/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20230504.Ch14_7_lambda4;
import java.util.function.BiFunction;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch14_7 {

    /**
     * @param args the command line arguments
     */
    static List<String> stringJoinInt(String st,Integer i){
        ArrayList<String> list = new ArrayList();
        list.add(st);
        list.add(i.toString());
        return list;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        BiFunction<String,Integer,List<String>> biFun1 = 
                (String st,Integer i)->{
                    List<String> list = new ArrayList();
                    list.add(st+":"+i);
                    return list;
                };
     System.out.println(biFun1.apply("T1", 81));
     
     BiFunction<String,Integer,List<String>> biFun2 = (st,i)->stringJoinInt(st,i);
     System.out.println(biFun2.apply("T2", 72));
     //method reference
     BiFunction<String,Integer,List<String>> biFun3 = Ch14_7::stringJoinInt;
     System.out.println(biFun3.apply("T3", 86));
    }
    
}
