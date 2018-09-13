/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author prez
 */
public class NewClass {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot r = new Robot();
        
//        Thread.sleep(2000); 
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_A);
//        r.keyRelease(KeyEvent.VK_A);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        
//        r.keyPress(KeyEvent.VK_BACK_SPACE);
//        r.keyRelease(KeyEvent.VK_BACK_SPACE);
//        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_S);
//        r.keyRelease(KeyEvent.VK_S);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        
//        r.keyPress(KeyEvent.VK_CONTROL);
//        r.keyPress(KeyEvent.VK_W);
//        r.keyRelease(KeyEvent.VK_W);
//        r.keyRelease(KeyEvent.VK_CONTROL);
//        
//        

        System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
    }   
}