package POM_Ajio;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	public WebDriver driver;
	@FindBy(xpath="//span[@class='orginal-price']//preceding::span[@class='price  ']")
    private List<WebElement> discount;
	
	public SearchProduct(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public List<WebElement> getDiscount() {
		return discount;
	}
	
}
