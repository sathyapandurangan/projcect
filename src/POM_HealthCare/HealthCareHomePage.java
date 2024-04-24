package POM_HealthCare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HealthCareHomePage {
	public WebDriver driver;
	@FindBy(id = "ad-plus")
	private WebElement adult;
	@FindBy(xpath = "(//input[@aria-label='Day (DD)'])[1]")
	private WebElement day;
	@FindBy(xpath = "(//input[@aria-label='Month (MM)'])[1]")
	private WebElement month;
	@FindBy(xpath = "(//input[@aria-label='Year (YYYY)'])[1]")
	private WebElement year;
	@FindBy(xpath = "(//a[text()='Done'])[1]")
	private WebElement done;
	@FindBy(id="kd-plus")
	private WebElement kids;
	@FindBy(id = "Chi-landing-mobile")
	private WebElement mobnum;
	@FindBy(id="Chi-landing-email")
	private WebElement email;
	@FindBy(id="chi-landing-pincode")
	private WebElement pincode;
	@FindBy(id="chi-landing-name")
	private WebElement name;
	@FindBy(id="chiSubmit")
	private WebElement quote;
	
	public HealthCareHomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getDone() {
		return done;
	}
	public WebElement getKids() {
		return kids;
	}
	public WebElement getMobnum() {
		return mobnum;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getQuote() {
		return quote;
	}
	

}
