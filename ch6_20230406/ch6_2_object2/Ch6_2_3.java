/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20230406.ch6_2_object2;

/**
 *
 * @author xvpow
 */
public class Ch6_2_3 {

    static Animal genAnimal(int type,String name,float weight){
       Animal an = null;
        switch(type){
            case Animal.CAT:
                an = new Cat(name,weight);
            break;    
            case Animal.DOG:
                an = new Dog(name,weight);
            break;    
            case Animal.MONKEY:
                an = new Monkey(name,weight);
            break;    
        }
        return an;
    }
    
    public static void main(String[] args) {
       int[] animals = {Animal.DOG,Animal.MONKEY,Animal.DOG,Animal.CAT};
        
        for (int type : animals){
           Animal animal =  genAnimal(type,"Gigi",5.12f);
           if (animal != null){
                animal.printInfo();
           }
          
        }
     
        
    }
    
}
