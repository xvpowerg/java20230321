/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2SEModule/module-info.java to edit this template
 */

module tw.com.m3 {
    //限制 tw.com.m3.fruit 只能用於tw.com.m4
    exports tw.com.m3.fruit to tw.com.m4;
    exports tw.com.m3.person to tw.com.m5;
}
