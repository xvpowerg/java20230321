/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20230427.Ch12_1_Erp1;

/**
 *
 * @author xvpow
 */
public abstract class Erp {
    
    private String[] readData(){
        String[] data = {"Ken,100,60,70",
            "Vivin,76,83,95","Lucy,62,77,88"};
        
        return data;
    }    
    
    public void exportReport(){
      String[]  data =   readData();
      reportStyle(data);
    }
    
    protected abstract void reportStyle(String[] data);
}
