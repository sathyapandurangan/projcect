package POM_Flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	public WebDriver driver;
	@FindBy(xpath = "//iframe[@class='_1JqCrR']")
	private WebElement frame;
	@FindBy(xpath = "//select[@class='_2YxCDZ']")
	private WebElement minvalue;
	@FindBy(xpath = "//div[@class='_2usHgU']")
	private WebElement vedio;
	@FindBy(xpath = "//button[@aria-label='Play']")
	private WebElement playbutton;
	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addtocart;
	
	public WebElement getFrame() {
		return frame;
	}

	public WebElement getVedio() {
		return vedio;
	}

	public WebElement getPlaybutton() {
		return playbutton;
	}

	public AddToCart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getMinvalue() {
		return minvalue;
	}

}
