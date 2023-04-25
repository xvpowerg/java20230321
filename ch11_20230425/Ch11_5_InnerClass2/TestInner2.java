/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230425.Ch11_5_InnerClass2;

/**
 *
 * @author xvpow
 */
public class TestInner2 {
    private String company;
    private int id;
    TestInner2(String company,int id){
        this.company = company;
        this.id = id;
    }
    private class MyInner2{
        public String toString(){
            return "MyInner2:"+company+":"+id;
        }
    }
    
    public void printMyCompany(){
        MyInner2 myInner = new MyInner2();
        System.out.println(myInner);
    }
}
