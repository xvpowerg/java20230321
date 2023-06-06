/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20230606.Ch23_5_io5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {
    public static void main(String[] args) {
        Random ran = new Random();
        int len = 100000000;
        ArrayList<Integer> list = new ArrayList();
        for (int i = 1;i<=len;i++){
            if (ran.nextInt(len) % 5 == 0  && 
                    ran.nextInt(len) % 2 == 0 && 
                     ran.nextInt(len) % 8 != 0 && 
                    ran.nextInt(len) % 6 != 0 ){
                list.add(i);
            }       
        }
        File file = new File("c:\\mydir\\list.obj");
        System.out.println(list.size());
        try(ObjectOutputStream objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) 
        {
            objOut.writeObject(list);
        }catch(IOException ex){
            System.out.println(ex);
        }
        System.out.println("Finish....");
    }
    
}
