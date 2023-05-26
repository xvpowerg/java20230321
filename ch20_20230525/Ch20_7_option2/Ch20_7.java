/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230525.Ch20_7_option2;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch20_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //不支持null
        Optional<String> op1 =  Optional.of("Ken");
        System.out.println(op1.get());
        Optional<String> op2 = Optional.empty();
        if (op2.isEmpty()){
            op2 = Optional.ofNullable("Vivin");
            
        }
        System.out.println(op2.get());
        //支持null
        Optional<String> op3 = Optional.ofNullable(null);
        System.out.println(op3.get());//內容為null會出現java.util.NoSuchElementException
        
        
    }
    
}
