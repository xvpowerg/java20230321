/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20230522.ch19_3_stream2;
import java.util.stream.Stream;
public class Ch19_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Stream 只能使用一次
        //Stream 有惰性 與 終端
        //Stream 不會改變原始資料
        Stream<Integer> st1 =  Stream.of(8,9,11,6,5);
        st1.filter(v->v%2 != 0).
                forEach(v->System.out.println(v));
        //Stream用了第二次所以出錯
        st1.filter(v->v%2 == 0).
                forEach(v->System.out.println(v));
    }
    
}
