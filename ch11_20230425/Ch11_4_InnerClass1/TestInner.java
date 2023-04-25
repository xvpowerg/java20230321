/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch11_20230425.Ch11_4_InnerClass1;

/**
 *
 * @author xvpow
 */
public class TestInner {
    
    public class MyInner1{
        private String msg;
        public MyInner1(String msg){
            this.msg = msg;
        }
        public void setMsg(String msg){
            this.msg = msg;
        }
        
        public String toString(){
            return msg;
        }
    }
    
    public void testMyInner1(String msg){
        MyInner1 myInner1 = new MyInner1(msg);
        System.out.println(myInner1);
    }
    
    
    public MyInner1 newMyInner1(String msg){
        MyInner1 myInner1 = new MyInner1(msg);
        return myInner1;
    }
    
}
