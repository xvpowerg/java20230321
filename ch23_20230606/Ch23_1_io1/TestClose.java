/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20230606.Ch23_1_io1;

/**
 *
 * @author xvpow
 */
public class TestClose implements AutoCloseable{
    private String name;
    private boolean thwEx;
    public TestClose(String name) {
        this.name = name;
    }
    public TestClose(String name,boolean b1) {
        this.name = name;
        this.thwEx = b1;
    }

    @Override
    public String toString() {
        return "TestClose{" + "name=" + name + '}';
    }
    
    public void close()throws Exception{
        System.out.println(this.name+" close");
        if (thwEx){
            throw new RuntimeException(this.name);
        }
    }
}
