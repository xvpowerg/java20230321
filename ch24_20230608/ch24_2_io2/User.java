/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20230608.ch24_2_io2;
import java.io.Serializable;
import java.io.IOException;
import java.time.LocalDateTime;
/**
 *
 * @author xvpow
 */
public class User implements Serializable {
    private String name;
    private String createTime;
    public User(String name, String createTime) {
        this.name = name;
        this.createTime = createTime;
    }
    private void writeObject(java.io.ObjectOutputStream out)throws IOException{
        System.out.println("writeObject!!");
        out.writeObject(name);
    }
    private void readObject(java.io.ObjectInputStream in)throws 
            IOException,ClassNotFoundException{
         System.out.println("readObject!!");
       this.name = in.readObject().toString();
       this.createTime = LocalDateTime.now().toString();
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", createTime=" + createTime + '}';
    }
    
    
}
