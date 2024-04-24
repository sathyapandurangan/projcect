package POM_Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath = "//a[text()='Kids']")
	private WebElement kids;
	@FindBy(xpath = "(//a[text()='Dresses'])[1]")
	private WebElement dresses;

	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getKids() {
		return kids; 
	}

	public WebElement getDresses() {
		return dresses;
	}

}
