/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20230525.Ch20_6_option1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Optional<String> getNameOp(){
            return Optional.ofNullable(name);
    }
}
