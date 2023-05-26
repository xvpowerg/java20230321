/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230523.ch19_4_generic2;
import java.util.ArrayList;
public class Ch19_4 {
    //一般的泛型 給於此變數的泛型必須一樣    
    static void showMyList(ArrayList<Test1> list){
        System.out.println(list);
    }
    //允許子類或自己
    //? extends 不可新增
    static void showMyList2(ArrayList<? extends Test1> list){
        //System.out.println(list);
        for(Test1 v : list){
            System.out.println(v);
        }
    }
    //允許父類或自己
    //可以新增類型限定為泛型定義的類型
    //可輸出類型為Object
    static void showMyList3(ArrayList<? super Test3> list){
        list.add(new Test3());
        for (Object v1  : list){
            System.out.println(v1);
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Test1> list1 = new ArrayList();
        showMyList(list1);
      ArrayList<Test2> list2 = new ArrayList();
      list2.add(new Test2());
       showMyList2(list2);
       ArrayList<Test3> list3 = new ArrayList();
       list3.add(new Test3());
       showMyList2(list3);
      ArrayList<Test4> list4 = new ArrayList();
      ArrayList<Test5> list5 = new ArrayList();
      System.out.println("==================================");
      showMyList3(list1); 
      showMyList3(list2); 
      showMyList3(list3); 
      //showMyList3(list5); 
    }
    
}
