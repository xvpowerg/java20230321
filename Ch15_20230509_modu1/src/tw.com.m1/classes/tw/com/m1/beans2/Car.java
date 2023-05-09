/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tw.com.m1.beans2;

/**
 *
 * @author xvpow
 */
public class Car {
        private String company;
        private int door;
       public Car(String company,int door){
            this.company = company;
            this.door = door;                    
       }
       public String getCompany(){
           return this.company;
       }
        public String toString(){
            return this.getCompany()+":"+this.door;
        }
}
