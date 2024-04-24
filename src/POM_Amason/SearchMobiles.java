package POM_Amason;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMobiles {
	public WebDriver driver;
	@FindBy(xpath = "//*[contains(text(),'Redmi Note 13 5G (Stealth Black, 6GB RAM, 128GB Storage)')]")
	private WebElement perticularmobile;
	@FindBy(xpath = "//input[@aria-labelledby='a-autoid-3-announce']")
	private WebElement vedio;
	@FindBy(id = "add-to-cart-button")
	private WebElement addtocart;
	public SearchMobiles(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getPerticularmobile() {
		return perticularmobile;
	}
	public WebElement getVedio() {
		return vedio;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}

}
