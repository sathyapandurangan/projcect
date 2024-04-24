package POM_Myntra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import BaseClass.BaseClass1;

public class Runner extends BaseClass1 {
	public static void main(String[] args) throws InterruptedException {
		List<Integer>list = new ArrayList<Integer>();
		PageOManager pom=new PageOManager();
		int max;
		int min;
		browserLaunch("chrome");
		getUrl("https://www.myntra.com/");
		mouseMoveToElement(pom.getHP().getKids());
		Thread.sleep(2000);
		javascript();
	    javaScriptclick(pom.getHP().getDresses());
	    Thread.sleep(2000);
	    List<WebElement> amount = pom.getDX().getAmount();
	    for(WebElement getprice:amount) {
	    	String text = getprice.getText();
	    	System.out.println(text); 
	    	String replace = text.replaceAll("Rs. ", "");
	    	int int1 = Integer.parseInt(replace);
	    	list.add(int1);
	    	 	
	    }
	    System.out.println(list);   
	    max=Collections.max(list);
	    System.out.println("maximum value is:"+max);
	    min=Collections.min(list);
	    System.out.println("minimum value is:"+min);
	}

}
