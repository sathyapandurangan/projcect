package POM_OrangeHRM;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import BaseClass.BaseClass1;

public class Runner extends BaseClass1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		PageOManager pom = new PageOManager();
		browserLaunch("chrome");
		getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		implicit(30);
		sendKey(pom.getln().getUsername(), "Admin");
		sendKey(pom.getln().getPassword(), "admin123");
		click(pom.getln().getLogin());
		click(pom.getDB().getAdmin());
		click(pom.getDB().getAdd());
		click(pom.getDB().getUserrole());
		robot(KeyEvent.VK_DOWN, KeyEvent.VK_DOWN);
		robot(KeyEvent.VK_ENTER, KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		click(pom.getDB().getStatus());
		robot(KeyEvent.VK_DOWN, KeyEvent.VK_DOWN);
		robot(KeyEvent.VK_ENTER, KeyEvent.VK_ENTER);
		sendKey(pom.getDB().getPassword(), "sathya@123");
		Thread.sleep(2000);
		String text = pom.getDB().getEmployeeelementtext().getText();
		sendKey(pom.getDB().getEmployeename(), text);
		Thread.sleep(3000);
		robot(KeyEvent.VK_DOWN, KeyEvent.VK_DOWN);
		robot(KeyEvent.VK_ENTER, KeyEvent.VK_ENTER);
		sendKey(pom.getDB().getUsername(), "sathya");
		Thread.sleep(3000);
		sendKey(pom.getDB().getConformpassword(), "sathya@123");
		click(pom.getDB().getSave());
		Thread.sleep(10000);
		sendKey(pom.getSd().getSearchusername(), "sathya");
		javascript();
		javaScriptclick(pom.getSd().getSearch());
		click(pom.getSd().getDelete());
		click(pom.getSd().getYesdelete());
		Thread.sleep(2000);
		close();
		
		
			
	}

}
