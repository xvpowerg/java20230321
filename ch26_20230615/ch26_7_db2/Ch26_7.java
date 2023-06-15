/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20230615.ch26_7_db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author xvpow
 */
public class Ch26_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String url = "jdbc:derby://localhost:1527/db20230615";
        String user = "qwer";
        String password = "12345";
        String sql = "INSERT INTO Student(id,st_name,score) VALUES (?,?,?)";
       try(Connection conn =
         DriverManager.getConnection(url, user, password);
        PreparedStatement stm = conn.prepareStatement(sql);){
        stm.setInt(1, 120);
        stm.setString(2, "Ben");
        stm.setDouble(3, 89.25);
        int count = stm.executeUpdate();
        if (count > 0 ){
            System.out.println("新增成功!");
        }
       }catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
