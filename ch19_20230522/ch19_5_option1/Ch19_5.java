/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230522.ch19_5_option1;

/**
 *
 * @author xvpow
 */
public class Ch19_5 {

    public static void main(String[] args) {
        Student st1 = new Student();
        
//        if (st1.getName() != null && st1.getName().length() > 2){
//            System.out.println(st1.getName());
//        }
        st1.setName("Ken");
    if (st1.getName().isPresent()){
          String name =  st1.getName().get();
          if (name.length() > 2){
              System.out.println(name);
          }           
        }
        
        
        
    }
    
}
