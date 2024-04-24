package POM_Ajio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

import BaseClass.BaseClass1;

public class Runner3 extends BaseClass1 {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> list = new ArrayList<Integer>();
		int max;
		int min;
		PageOManager pom = new PageOManager();
		browserLaunch("chrome");
		getUrl("https://www.ajio.com/");
		getTitle();
		mouseMoveToElement(pom.getAHP().getMen());
		Thread.sleep(2000);
		click(pom.getAHP().getJeans());
		List<WebElement> discount = pom.getSP().getDiscount();
		for (WebElement price : discount) {
			String getprice = price.getText();
			System.out.println(getprice);
			String replaceAll = getprice.replaceAll("$", "");
			int int1 = Integer.parseInt(replaceAll);
			list.add(int1);
		}
		System.out.println(list);
		max=Collections.max(list);
		System.out.println("maximun value is:"+max);
		min=Collections.min(list);
		System.out.println("minimum value is:"+min);

	}

}
