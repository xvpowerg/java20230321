/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20230502.Ch13_7_if7;
import java.util.function.Function;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class Ch13_7 {

    
    static int  mapStringToInt(String value,
            Function<String,Integer> func){
        return func.apply(value);
    }
    
    static void addArrayValue(int[] array,
            UnaryOperator<Integer> op){
       for (int i = 0; i < array.length;i++){
           array[i] = op.apply(array[i]);
       }
      
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        StringToInt sti = new StringToInt();
       int v =  mapStringToInt("ABCD",sti);
       System.out.println(v);
       
       Add5 a5 = new Add5();
       int[] values = {1,2,3,4};
       addArrayValue(values,a5);
       for (var v2 : values){
           System.out.print(v2+" ");
       }
    }
    
}
