/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230613.ch25_1_nio2_1;
import java.io.FileInputStream;
import java.io.File;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Ch25_1 {
    public static void main(String[] args) throws Exception{
            File f1 = new File("c:\\mydir\\netbeans-17-bin.zip");
            Path target = Paths.get("c:","mydir","netbeans-17-copy-bin.zip");
            FileInputStream fin = new FileInputStream(f1);
                
            Files.copy(fin, target,StandardCopyOption.REPLACE_EXISTING);
            
            
    }
    
}
