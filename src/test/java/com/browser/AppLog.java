package com.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLog {

	@Test
	public void login_Test()
	{
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.nopcommerce.com/register");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.navigate().to("https://demo.nopcommerce.com/register");
	//System.out.println("Title:"+driver.getTitle());
	//System.out.println("URL:"+driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	
	//**WebElement searchStore= driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	//System.out.println("User:"+ searchStore.isDisplayed());
	//System.out.println("User:"+ searchStore.isEnabled());
	//WebElement Female= driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label"));
	//System.out.println("User:"+ Female.isSelected());
	//Female.click();
	//System.out.println("User:"+ Female.isSelected());
	
	
	}
}
