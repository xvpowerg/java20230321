/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20230406.ch6_2_object2;

/**
 *
 * @author xvpow
 */
public class Ch6_2 {

    /**
     * @param args the command line arguments
     */
    //多型(Polymorphism)
    public static void main(String[] args) {
       Dog dog1 = new Dog("momo",15.6f);
       Cat cat1 = new Cat("Kitty",5.2f);
       dog1.printInfo();
       Animal a1 = dog1;
       a1.printInfo();
       cat1.printInfo();
       Animal a2 = cat1;
       a2.printInfo();
       
       
    }
    
}
