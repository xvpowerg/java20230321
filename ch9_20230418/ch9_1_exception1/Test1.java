/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20230418.ch9_1_exception1;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Test1 {
    //Exception
    //必須try catch 或拋出(throw)
    void testException(boolean canThw)throws Exception{
        if (canThw){
           throw new Exception(); 
        }
    }
    
    
    //RuntimeExcepiton
    //不一定 try catch 或拋出(throw)
    public void testRuntimeException(boolean canThw)throws RuntimeException{
        if (canThw){
            throw new RuntimeException();
        }
    }
    
    
    protected void testException2(boolean ex1,boolean ex2,boolean ex3)
            throws IOException,FileNotFoundException,SQLException{
        if (ex1){
            throw new IOException();
        }else if(ex2){
            throw new FileNotFoundException();
        }else if (ex3){
            throw new SQLException();
        }
    }
    
}
