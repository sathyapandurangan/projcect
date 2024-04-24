package BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClass1Test extends BaseClass1  {
	public static void main(String[] args) throws AWTException {
		browserLaunch("chrome");
		getUrl("https://www.flipkart.com/");
		WebElement search = driver.findElement(By.name("q"));
		sendKey(search, "baby soap");
		robot(KeyEvent.VK_ENTER,KeyEvent.VK_ENTER);
		WebElement popularity = driver.findElement(By.xpath("(//div[@class='_10UF8M'])[1]"));
		click(popularity);
		WebElement electronics = driver.findElement(By.xpath("(//*[@class='_2I9KP_'])[1]"));
		click(electronics);
		WebElement samsung = driver.findElement(By.xpath("//a[@title='Samsung']"));
		mouseMoveToElement(samsung);
		click(samsung);
		
	}

}
