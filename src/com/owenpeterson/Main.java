package com.owenpeterson;


import java.awt.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {

        Thread.sleep(5000);
        String openChrome = "chrome.exe";
        String rickRoll = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        ClipboardSetter clipboardSetter = new ClipboardSetter();

        Robot robot = new Robot();

        while(true){
            //Opens run menu
            robot.keyPress(KeyEvent.VK_WINDOWS);
            robot.keyPress(KeyEvent.VK_R);
            robot.keyRelease(KeyEvent.VK_WINDOWS);
            robot.keyRelease(KeyEvent.VK_R);

            ClipboardSetter.setClipboard(openChrome);

            //Lets Run figure out what the hell is going on
            Thread.sleep(500);

            //Pastes chrome.exe
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);


            //Presses ENTER
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            
            Thread.sleep(500);


            ClipboardSetter.setClipboard(rickRoll);

            //Pastes rickRoll
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            //Presses ENTER
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);


        }







    }
}

//Never Gonna Give You Up: https://www.youtube.com/watch?v=dQw4w9WgXcQ