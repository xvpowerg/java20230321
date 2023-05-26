/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230523.ch19_3_generic1;

/**
 *
 * @author xvpow
 */
public class Ch19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MyList<String> strList = new MyList();
      strList.add("A");
      strList.add("B");
      strList.add("C"); 
      strList.foreach(v->System.out.println(v));
      
       MyList<Integer> strList2 = new MyList();
        strList2.add(10);
        strList2.add(25);
        strList2.add(3);
        strList2.foreach(v->System.out.println(v));
    }
    
}
