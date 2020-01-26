package org.maven.adactin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
static WebDriver driver;
	
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static WebDriver launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maha v\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		 driver =new ChromeDriver();
		maximize();
		return driver;
		
	}
	public static void takeScreenShot(String data) throws IOException
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\Maha v\\Desktop\\Adactin\\"+data);
		FileUtils.copyFile(src, desc);
		
	}
	public static void openUrl(String URL)
	{
		driver.get(URL);
	}
	public static void type(WebElement element,String name)
	{
		element.sendKeys(name);
	}
	public static void btnClick(WebElement element)
	{
		element.click();
	}
	public static void selectByVisibleText(WebElement e,String str)
	{
		Select s=new Select(e);
		s.selectByVisibleText(str);
	}
	public static WebElement findByXPathLocator(WebDriver driver,String xpath)
	{
		return driver.findElement(By.xpath(xpath));
	}
	public static void quitBrowser()
	{
		driver.quit();
	}
}
