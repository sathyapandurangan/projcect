package POM_Flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(name="q")
	private WebElement searchbox;
	@FindBy(xpath = "//div[text()='REDMI Note 13 Pro+ 5G (Fusion Purple, 256 GB)']")
	private WebElement perticularmobile;
	
	public WebElement getPerticularmobile() {
		return perticularmobile;
	}
	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	
	
	

}
