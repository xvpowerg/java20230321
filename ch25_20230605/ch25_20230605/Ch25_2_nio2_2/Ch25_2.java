/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230605.Ch25_2_nio2_2;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
/**
 *
 * @author xvpow
 */
public class Ch25_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
       Path src= Paths.get("c:", "mydir","netbeans-17-bin.zip");
       Path target= Paths.get("c:", "mydir","netbeans-17-bin_copy.zip");
       //StandardCopyOption.REPLACE_EXISTING 檔案重複就覆蓋
       //Files.copy(src, target,StandardCopyOption.REPLACE_EXISTING);
       Path moveSrc = Paths.get("c:", "mydir","netbeans-17-bin_copy.zip");
       Path moveTarget = Paths.get("c:", "mydir","dir","netbeans-17-bin_copy.zip");
       Files.move(moveSrc, moveTarget,StandardCopyOption.REPLACE_EXISTING,
                                      StandardCopyOption.ATOMIC_MOVE);
    }
    
}
