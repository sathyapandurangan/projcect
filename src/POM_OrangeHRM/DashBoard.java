package POM_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	public WebDriver driver;
	@FindBy(xpath = "(//a[@class='oxd-main-menu-item'])[1]")
	private WebElement admin;
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement add;
	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
	private WebElement userrole;
	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
	private WebElement status;
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement password;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeename;
	@FindBy(xpath = "(//input[@autocomplete='off'])[1]")
	private WebElement username;
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement conformpassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement employeeelementtext;
	
	
	public WebElement getPassword() {
		return password;
	}

	public WebElement getEmployeeelementtext() {
		return employeeelementtext;
	}

	public WebElement getEmployeename() {
		return employeename;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getConformpassword() {
		return conformpassword;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getAdd() {
		return add;
	}
	
	public WebElement getStatus() {
		return status;
	}
	public DashBoard(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getAdmin() {
		return admin;
	}
	
	public WebElement getUserrole() {
		return userrole;
	}
	
	

}
