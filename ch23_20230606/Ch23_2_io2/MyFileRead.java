/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20230606.Ch23_2_io2;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class MyFileRead extends InputStreamReader{
    public MyFileRead(File file,String code)
            throws FileNotFoundException,UnsupportedEncodingException{
        super(new FileInputStream(file),code );
    }
    public MyFileRead(File file)throws FileNotFoundException,UnsupportedEncodingException{
        this(file,"utf-8");
    }
}
