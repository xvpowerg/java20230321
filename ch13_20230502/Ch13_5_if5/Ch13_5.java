/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230502.Ch13_5_if5;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch13_5 {
//Consumer<T>  	accept​(T t)
// Supplier<T>  T get()
 //Function<T,​R>  R apply​(T t)
 //UnaryOperator<T>    T apply​(T t)
 //Predicate<T> boolean	test​(T t) 謂詞
    /**
     * @param args the command line arguments
     */
    
    static void foreach(Consumer<String> style,String... value){
        for (String s : value){
            style.accept(s);
            //System.out.println(s);
        }
    }
    
    
    public static void main(String[] args) {
        Consumer p1  = new PrintStyle();
       foreach(p1,"Ken","Vivin","Lucy");       
    }
    
}
