/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230615.ch26_8_db3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author xvpow
 */
public class Ch26_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String url = "jdbc:derby://localhost:1527/db20230615";
        String user = "qwer";
        String password = "12345";
        String sql = "SELECT * FROM Student";
       try(Connection conn =
         DriverManager.getConnection(url, user, password);
         PreparedStatement stm = conn.prepareStatement(sql);){
         ResultSet reSet =   stm.executeQuery();
         while(reSet.next()){
            int id =  reSet.getInt(1);
            String name =  reSet.getString("st_name");
            double score =  reSet.getDouble("score");
            System.out.println(id+":"+name+":"+score);
         }   
         
       }catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
