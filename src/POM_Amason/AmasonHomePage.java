package POM_Amason;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmasonHomePage {
	public WebDriver driver;
	@FindBy(id = "twotabsearchtextbox")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	
	public AmasonHomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	

}
