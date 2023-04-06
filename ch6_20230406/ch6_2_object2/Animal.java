/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20230406.ch6_2_object2;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private float weight;
    public static final int DOG = 1;
    public static final int CAT = 2;
      public static final int MONKEY = 3;
    Animal(){        }
    Animal(String name,float weight){
        this.name  = name;
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public float getWeight(){
        return weight;
    }
    
    public void printInfo(){
        System.out.println(name+":"+weight);
    }
}
