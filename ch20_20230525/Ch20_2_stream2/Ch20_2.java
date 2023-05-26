/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230525.Ch20_2_stream2;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;
/**
 *
 * @author xvpow
 */
public class Ch20_2 {

    public static void main(String[] args) {
        //一個Stream 只能使用一次
        //Stream不會改變原始物件
        //Stream 有分惰性與終端
      Stream<Integer> st1 = Stream.of(20,51,26,17,25,18);
      st1.filter(p->p%2 == 0).forEach(v->System.out.println(v));
      System.out.println("======================");
      st1.filter(p->p%2 != 0).forEach(v->System.out.println(v));
      //int請使用 IntStream
      
    }
    
}
