package com.vedha.seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunching {
@Test
public void chromeSession()
{
	//webdriverManager is an class which activates the chrome driver updates
	WebDriverManager.chromedriver().setup();
	//web driver is an interface to create an instance to chrome driver to launch the browser
	WebDriver driver=new ChromeDriver();
	driver.get("https://vedhaschoolofautomation.blogspot.com/");
	WebElement element=new WebDriverWait(driver, Duration.ofMillis(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Polymorphism']")));
	System.out.println("chrome browser launched");
	String s=driver.getTitle(); // get the page title
	System.out.println(s);
	driver.close();//close the browser
	
}
@Test
public void edge()
{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://vedhaschoolofautomation.blogspot.com/");
	System.out.println("Edge browser launched");
	String s=driver.getPageSource();//get the source code of the page
	System.out.println(s);
	driver.quit();//it is used for quit the window and related tabs also
}
@Test
void firFox()
{

	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://vedhaschoolofautomation.blogspot.com/");
	String s=driver.getWindowHandle();
	System.out.println(s);
	driver.close();
}
@Test
public void chromesession()
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("incogintive mode");
	WebDriver driver=new ChromeDriver(options);
	driver.get("https://vedhaschoolofautomation.blogspot.com/");
}
@Test
public void gmail()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("ashwin@gmail.com");
	WebElement element=new WebDriverWait(driver, Duration.ofMillis(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Learn more']")));
	String text=element.getText();
	System.out.println(text);
	driver.close();
	}
@Test
public void testImplicitWait()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	driver.findElement(By.name("identifier")).sendKeys("ashwinireddy445@gmail.com");
String attribute=driver.findElement(By.xpath("//button[@type='button']")).getAttribute("type");
System.out.println(attribute);
	driver.close();	
}


}
