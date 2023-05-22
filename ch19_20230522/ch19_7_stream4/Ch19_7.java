/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230522.ch19_7_stream4;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_7 {

    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList();
        data.add("Vivin");
        data.add("Ken");
        data.add("Lucy");
        data.add("Iris");
        boolean b1 = data.stream().allMatch(v->v.length() > 2);
        System.out.println(b1);
        boolean b2 = data.stream().anyMatch(v->v.length() < 4);
        System.out.println(b2);
        boolean b3 = data.stream().noneMatch(v->v.length() > 10);
        System.out.println(b3);
    }
    
}

