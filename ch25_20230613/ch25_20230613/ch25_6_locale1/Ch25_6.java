/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20230613.ch25_6_locale1;
import java.util.ResourceBundle;
import java.util.Locale;
/**
 *
 * @author xvpow
 */
public class Ch25_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //沒指定 Locale 使用查看系統預設語系
        //有指定 Locale 1 指定語系的properties是否存在 存在就使用 不存在 使用系統預設語系
        //以上都不存在的key 使用defalur properties
        ResourceBundle res = ResourceBundle.getBundle("messages");
        System.out.println(res.getString("tw.welcom"));
        System.out.println(res.getString("tw.name"));
        System.out.println(res.getString("tw.color"));  
         System.out.println(res.getString("tw.edit"));  
        Locale local = new Locale("en","US");
       ResourceBundle res2 = ResourceBundle.getBundle("messages",local);
       System.out.println(res2.getString("tw.welcom"));
        System.out.println(res2.getString("tw.name"));
        System.out.println(res2.getString("tw.color")); 
         System.out.println(res.getString("tw.edit"));  
    }
    
}
