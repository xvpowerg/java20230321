/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch16_20230511.ch16_1_enum1;

/**
 *
 * @author xvpow
 */
public class MPlayer {
    //enum 預設是靜態變數
    public enum MyPlayAction{
        PLAY,EXIT,PAUSE
    }
   public  static interface MPlayerActionType{
        int PLAY = 1;
        int EXIT = 2;
        int PAUSE= 3;
        
    }
   
   public void actionEnum(MyPlayAction action){
       switch(action){
           case PLAY:
               System.out.println("PLAY!!");
             break;
           case  EXIT:
               System.out.println("EXIT!!");
               break;
           case  PAUSE:
                System.out.println("PAUSE!!");
               break;                          
       }
   }
    public void action(int type){

        switch(type){
            case MPlayerActionType.PLAY:
                System.out.println("PLAY!");
               break;
           case MPlayerActionType.EXIT:
               System.out.println("EXIT!");
               break;
            case MPlayerActionType.PAUSE:
               System.out.println("PAUSE!");
               break;   
        }
    }
}
