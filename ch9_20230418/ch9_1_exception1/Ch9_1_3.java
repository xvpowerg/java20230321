/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20230418.ch9_1_exception1;
import java.sql.SQLException;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch9_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IOException 是 FileNotFoundException 父類 多型效果啟動 所以IOException 可以抓到FileNotFoundException
        //越下越父
        Test1 t1 = new Test1();
        try{
            t1.testException2(true, true, true);
        }catch(SQLException ex){
            System.out.println(ex);
        }catch(FileNotFoundException ex){
             System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
}
