package POM_Ajio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjioHomePage {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='MEN']")
	private WebElement men;
	@FindBy(xpath = "//a[@title='Jeans']")
	private WebElement jeans;
	
	public AjioHomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getMen() {
		return men;
	}
	public WebElement getJeans() {
		return jeans;
	}
	

}
