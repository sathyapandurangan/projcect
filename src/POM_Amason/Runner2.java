package POM_Amason;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import BaseClass.BaseClass1;

public class Runner2 extends BaseClass1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		PageOManager2 pm = new PageOManager2();
		browserLaunch("chrome");
		getUrl("https://www.amazon.in/");
		click(pm.getAHP().getSearch());
		sendKey(pm.getAHP().getSearch(),"mobiles");
		robot(KeyEvent.VK_ENTER, KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		click(pm.getsm().getPerticularmobile());
		implicit(30);
		javascript();
		javaScriptclick(pm.getsm().getVedio());
		//click(pm.getsm().getVedio());
		//click(pm.getsm().getAddtocart());
		
	}

}
