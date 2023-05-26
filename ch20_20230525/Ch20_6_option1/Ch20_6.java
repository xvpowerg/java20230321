/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20230525.Ch20_6_option1;

/**
 *
 * @author xvpow
 */
public class Ch20_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Ken");
        if (st.getName()!= null && st.getName().length() >= 2){
            System.out.println(st.getName());
        }
        
        if (st.getNameOp().isPresent()){
            String name = st.getNameOp().get();
           if ( name.length() >= 2){
               System.out.println(name);
           }
        }
    }
    
}
