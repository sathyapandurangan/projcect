package POM_HealthCare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthPlanFinder {
	public WebDriver driver;
	@FindBy(id="mat-input-1")
	private WebElement search;
	@FindBy(xpath = "//a[text()='New Delhi']")
	private WebElement city;
	@FindBy(xpath="//a[text()='Search hospitals']")
	private WebElement searchhospitals;
	@FindBy(xpath="//a[@class='close js-popup-close']")
	private WebElement close;
	
	public HealthPlanFinder(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getSearchhospitals() {
		return searchhospitals;
	}
	public WebElement getClose() {
		return close;
	}

}
