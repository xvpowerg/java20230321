/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230615.ch26_9_db4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author xvpow
 */
public class Ch26_9 {

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
      conn.setAutoCommit(false);
       stm.execute("INSERT INTO Student(id,st_name,score) "
                 + "VALUES (300,'Lucy',75)");
                 
       stm.execute("INSERT INTO Student(id,st_name,score) "
                 + "VALUES (400,'Vivin',75)");
       conn.commit();
       }catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
