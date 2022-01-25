package com.wangy265;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WechatRobot {
	
	private static void openWechat(Robot robot) {
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_W);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_ALT);
	    robot.delay(1000);
	}
	
	private static void findFriend(Robot robot, String userName) {
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_F);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
	    Transferable tText = new StringSelection(userName);
	    clip.setContents(tText, null);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.delay(1000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	private static void sendMessage(String message) throws AWTException {
	    Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
	    Robot robot = new Robot();
	    StringSelection text = new StringSelection(message);
	    clip.setContents(text, null);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.delay(500);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.delay(500);
	}
	
	private static void closeWechat(Robot robot) {
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ALT);
	    robot.keyPress(KeyEvent.VK_W);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_ALT);
	}

	
	
	public static synchronized void sendMessage(String user, String message) {
        try {
            Robot robot = new Robot();

            openWechat(robot);

            findFriend(robot, user);

            sendMessage(message);

            closeWechat(robot);
        } catch (AWTException e) {
            log.error("发消息异常");
        }
    }





}
