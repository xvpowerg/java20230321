/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1;

/**
 *
 * @author xvpow
 */
public class Ch1_7 {

    /**
     * @param args the command line arguments
     */
    //就是好teacher教學平台
    public static void main(String[] args) {
       //switch 可傳參數類型有
       //byte short int char String Enum
      //final 不可做什麼
       final int PLAY = 1;    
       final int STOP = 2;
       final int EXIT = 3;
       int action = EXIT;       
        switch(action){
            default:
            System.out.println("Error");
                break;
             //case的數值只能使用常數   
            case PLAY:
                System.out.println("Play");
                break;
            case STOP:
                System.out.println("Stop");
                break;
            case EXIT:
                System.out.println("Exit");
                break;
                
                
        }
        
    }
    
}
