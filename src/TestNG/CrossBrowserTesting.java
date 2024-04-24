package TestNG;

import org.testng.annotations.Test;

import BaseClass.BaseClass1;

public class CrossBrowserTesting extends BaseClass1 {
	@Test
	private void chrome() {
		browserLaunch("chrome");
		getUrl("https://www.flipkart.com/");
		System.out.println("Browser ID:" + Thread.currentThread().getId());
	}

	@Test
	private void edge() {
		browserLaunch("edge");
		getUrl("https://www.flipkart.com/");
		System.out.println("Browser ID:" + Thread.currentThread().getId());
	}

	@Test
	private void firefox() {
		browserLaunch("firefox");
		getUrl("https://www.flipkart.com/");
		System.out.println("Browser ID:" + Thread.currentThread().getId());
	}

}
