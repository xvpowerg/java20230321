/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20230425.Ch11_6_InnerClass3;
import ch11_20230425.Ch11_6_InnerClass3.TestInner3.MyInner3;
import static ch11_20230425.Ch11_6_InnerClass3.TestInner3.min;
public class Ch11_6 {

    public static void main(String[] args) {
       TestInner3.MyInner3 myInner = new TestInner3.MyInner3();
       int ans = myInner.sum(12,55,63,71,89);
       System.out.println(ans);
       
       MyInner3 myInner2 = new MyInner3();
       int ans2 = myInner2.sum(5,7,9,2,1);
       System.out.println(ans2);
       
     System.out.println(TestInner3.min(7, 2));
     System.out.println(min(6,9));
    }
    
}
