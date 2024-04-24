package POM_Flipcart;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebElement;

import BaseClass.BaseClass1;

public class Runner extends BaseClass1 {
	public static void main(String[] args) throws AWTException {
		PageOManager po = new PageOManager();
		browserLaunch("chrome");
		getUrl("https://www.flipkart.com/");
		click(po.getHp().getSearchbox());
		sendKey(po.getHp().getSearchbox(),"mobile");
		robot(KeyEvent.VK_ENTER,KeyEvent.VK_ENTER );
		click(po.getHp().getPerticularmobile());
		implicit(30);
		windowHandles(1);
		javascript();
		javaScriptclick(po.getAtc().getVedio());
		frame(po.getAtc().getFrame());
		click(po.getAtc().getPlaybutton());
		//WebElement minvalue = po.getAtc().getMinvalue();
		//click(po.getAtc().getPlaybutton());
		//mouseClick(po.getAtc().getPlaybutton());
		//click(po.getAtc().getAddtocart());
		
	}

}
