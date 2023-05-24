/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230524.Ch20_4_stream4;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author xvpow
 */
public class Ch20_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<Integer> list = new ArrayList<>();
     list.add(25);
     list.add(10);
     list.add(12);
     list.add(15);
     
     //list.stream().filter(v->v < 20).forEach(v->System.out.println(v));
    List<Integer> result = list.stream().filter(v->v < 20)
            .collect(Collectors.toList());
    System.out.println(result);
     TreeSet<Integer> result2 = list.stream().filter(v->v%2!=0).collect(Collectors.
             toCollection(TreeSet::new));
    System.out.println(result2);
    }
    
}
