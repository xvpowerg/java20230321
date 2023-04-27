/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230427.Ch12_2_Report;
import ch12_20230427.Ch12_1_Erp1.Erp;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MyReport  extends Erp{
   
    protected void reportStyle(String[] data){
          ArrayList<Employee> list = new ArrayList();
          for (String d : data){
              String[] tmp =   d.split(",");
              Employee emp = new Employee();
              emp.setName(tmp[0]);
              emp.appendScore(Integer.parseInt(tmp[1]));
              emp.appendScore(Integer.parseInt(tmp[2]));
              emp.appendScore(Integer.parseInt(tmp[3]));
              list.add(emp);
          }
          System.out.println(list);
    }
}
