package org.app.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver = null;
	public static JavascriptExecutor js=null;

	public static void browserlaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public static void input_Data(WebElement element, String data) {
		new Actions(driver).moveToElement(element).perform();
		element.sendKeys(data);
	}
	
	public static void input_Data_Enter(WebElement element, String data) {
		element.sendKeys(data);
		element.sendKeys(Keys.ENTER);
	}

	public static void input_Data_clear(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
	}
	
	public static void input_Data_clear_Enter(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
//		element.sendKeys(Keys.ENTER);
	}

	public static void click_Value(WebElement element) {
		new Actions(driver).moveToElement(element).perform();
		element.click();
	}

	public static void dropdpown_Value(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public static String getAttribute(WebElement element) {
		System.out.println(element.getAttribute("value"));
		return element.getAttribute("value");
	}
	
	public static void javascript_Casting() {
		js=(JavascriptExecutor)driver;
	}
	
	public static void javascript_Click(WebElement element) {
		javascript_Casting();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);
	}

	public static String prop_reuse(String data) {
		String value = null;
		try {
			File f = new File("G:\\Kabil\\maven project\\Cheapair\\src\\test\\"
					+ "resources\\testData\\config.properties");
			FileReader read = new FileReader(f);
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
//			System.out.println(value);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

	@SuppressWarnings("deprecation")
	public static void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static WebElement explicitlyWait(long sec, By x) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		return wait.until(ExpectedConditions.presenceOfElementLocated(x));
	}

}
