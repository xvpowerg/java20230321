/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20230522.ch19_5_option1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
