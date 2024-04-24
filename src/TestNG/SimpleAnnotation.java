package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	@BeforeSuite
	private void propertySetting() {
		System.out.println("property setting");
	}

	@BeforeTest
	private void browserLunch() {
		System.out.println("Browser Launch");
	}

	@BeforeClass
	private void urlLaunch() {
		System.out.println("url launch");
	}

	@BeforeMethod
	private void login() {
		System.out.println("login");
	}

	@Test
	private void searchProduct() {
		System.out.println("find the product");
	}

	@Test
	private void addToCart() {
		System.out.println("product added in cart");
	}

	@Test
	private void deliverTheProduct() {
		System.out.println("product have been delivered");
	}

	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}

	@AfterClass
	private void screenShot() {
		System.out.println("take screenshot");
	}

	@AfterTest
	private void closeTab() {
		System.out.println("tab closed");
	}

	@AfterSuite
	private void quit() {
		System.out.println("terminate browser");
	}

}
