package BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public static WebDriver driver;
	private static Object javascript;

	// 1.browser lanch
	public static void browserLaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (name.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (name.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}

	// 2.get url
	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 3.get title
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("Title:"+title);
	}

	// 4.get pagesource
	public static void getPageSource() {
		String pageSource = driver.getPageSource();
		System.out.println("PageSource is:"+pageSource);
	}

	// 5.sendkey
	public static void sendKey(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 6.click
	public static void click(WebElement element) {
		element.click();
	}

	// 7.close
	public static void close() {
		driver.close();
	}

	// 8.robot class
	public static void robot(int x, int y) throws AWTException {
		Robot r = new Robot();
		r.keyPress(x);
		r.keyRelease(y);
	}

	// 9.Actions class
	public static Actions mouseMovement() {
		Actions s = new Actions(driver);
		return s;
	}

	// 10.mouse click
	public static void mouseClick(WebElement element) {
		try {
			mouseMovement().click().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 11.mouse doubleclick
	public static void mouseDoubleClick(WebElement element) {
		try {
			mouseMovement().doubleClick().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 12.mouse rightclick
	public static void mousecontextClick(WebElement element) {
		try {
			mouseMovement().contextClick().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 13.mouse movetoelement
	public static void mouseMoveToElement(WebElement element) {
		try {
			mouseMovement().moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 14.mouse drag and drop
	public static void mouseDragAndDrop(WebElement element, WebElement elemt) {
		try {
			mouseMovement().dragAndDrop(element, elemt).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 15.is displayed
	public static void isDisplayed(WebElement element) {
		try {
			element.isDisplayed();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 16. is enabled
	public static void isEnabled(WebElement element) {
		try {
			element.isEnabled();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 17.is selected
	public static void isSelected(WebElement element) {
		try {
			element.isSelected();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 18. take screen short
	public static void screenshort(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(location);
		FileUtils.copyFile(source, destination);
	}

	// 19.java script executor
	public static JavascriptExecutor javascript() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	// 20.scroll intoview
	public static void scrollIntoView(WebElement element) {
		try {
			javascript().executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 21.scroll into starting page
	public static void startingPage() {
		javascript().executeScript("window.scroll(0,0)");
	}

	// 22.scroll up
	public static void scrollUp(int x, int y) {
		try {
			javascript().executeScript("window.scrollBy(x,y)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 23.scrollDown
	public static void scrollDown(int x, int y) {
		try {
			javascript().executeScript("window.scrollBy(x,y)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 24.javascriptsendkey
	public static void javaScriptSendKey(String name, WebElement element) {
		try {
			javascript().executeScript("arguments[0].value='name';", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 25.javaclick
	public static void javaScriptclick(WebElement element) {
		try {
			javascript().executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 26.frame
	public static void frame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 27.frame index and id
	public static void frameIndexAndId(String name) {
		try {
			driver.switchTo().frame(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// 28.implicit wait

	public static void implicit(int x) {
		driver.manage().timeouts().implicitlyWait(x, TimeUnit.SECONDS);
	}

	// 29.Explicit wait
	public static void Explicit(WebElement element, int x) {
		WebDriverWait wait = new WebDriverWait(driver, x);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// 30.window handles
	public static void windowHandles(int x) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> winHandles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(winHandles.get(x));
		for (String title : winHandles) {
			String title2 = driver.switchTo().window(title).getTitle();
			System.out.println(title2);
		}
		System.out.println("Total number of window:" + winHandles.size());
		driver.switchTo().window(winHandles.get(x));
	}

}
