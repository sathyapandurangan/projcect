package POM_Myntra;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicXpath {
	public WebDriver driver;
	@FindBy(xpath = "//span[@class='product-strike']//preceding::span[@class='product-discountedPrice']")
	private List<WebElement> amount;
	//@FindBy(xpath="//li[@class='product-base']//following::span[text()=""]//ancestor::div[@class='product-productMetaInfo']")
	public DynamicXpath(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public List<WebElement> getAmount() {
		return amount;
	}

	
}
