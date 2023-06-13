/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230613.ch25_4_nio2_4;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.io.IOException;
public class Ch25_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        Path p1 = Paths.get("c:", "mydir","dir");
        //預設的maxDepth 是int最大值2147483647
        Stream<Path> strP =  Files.walk(p1);
        //strP.forEach(p->System.out.println(p));
       List<Path> textList = strP.filter(p->p.toString().contains(".txt")).
                collect(Collectors.toList());
          System.out.println(textList);
    }
    
}
