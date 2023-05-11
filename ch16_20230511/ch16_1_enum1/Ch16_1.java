/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20230511.ch16_1_enum1;
/**
 *
 * @author xvpow
 */
public class Ch16_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MPlayer myp = new MPlayer();
        myp.action(MPlayer.MPlayerActionType.EXIT);
        myp.action(5);        
        myp.actionEnum(MPlayer.MyPlayAction.PAUSE);
   
    }
    
}
