/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20230425.Ch11_4_InnerClass1;

/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestInner tin1 = new TestInner();
       tin1.testMyInner1("MyInner!!!");
       TestInner.MyInner1 myInn1 = 
               new TestInner().new MyInner1("MyInner2");
       System.out.println(myInn1);
       
        TestInner.MyInner1 myInner2 = 
                tin1.newMyInner1("MyInner3");
        System.out.println(myInner2);
    }
    
}
