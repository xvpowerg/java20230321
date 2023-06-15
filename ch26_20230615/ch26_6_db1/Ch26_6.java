/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230615.ch26_6_db1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch26_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/db20230615";
        String user = "qwer";
        String password = "12345";
        
       try(Connection conn =
       DriverManager.getConnection(url, user, password);
        Statement stm = conn.createStatement();){
       stm.execute("INSERT INTO Student(id,st_name,score) "
                 + "VALUES (100,'Vivin',75)");
         
       }catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
