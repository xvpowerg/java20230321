/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230613.ch25_5_nio2_5;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
public class Ch25_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        Path p1 = Paths.get("c:", "mydir","msg.txt");
        //,
        Stream<String> stPth =  Files.lines(p1,Charset.forName("big5"));
       // stPth.forEach(v->System.out.println(v));
     
        //Character.
        //   Character.DECIMAL_DIGIT_NUMBER;
       //System.out.println(Character.getType('@')); 
        stPth.flatMapToInt(st->st.chars()).
                filter(c->Character.getType(c) ==
                        Character.DECIMAL_DIGIT_NUMBER).
                mapToObj(i->String.valueOf((char)i) ).
                forEach(n->System.out.println(n));
               
    }
    
}
