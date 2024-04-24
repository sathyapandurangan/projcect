package POM_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAndDelete {
	public WebDriver driver;
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement searchusername;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search;
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement delete;
	@FindBy(xpath = "(//button[@type='button'])[9]")
	private WebElement yesdelete;
	
	public WebElement getYesdelete() {
		return yesdelete;
	}
	public WebElement getDelete() {
		return delete;
	}
	public SearchAndDelete(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getSearchusername() {
		return searchusername;
	}
	public WebElement getSearch() {
		return search;
	}
	
	

}
