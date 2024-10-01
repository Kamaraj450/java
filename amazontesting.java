package org.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontesting {
	public static void main(String[]args) {
		
System.setProperty("WebDriver.ChromeDriver","C:\\Users\\HAVOC\\eclipse-workspace\\Automation\\library\\selenium-server-4.25.0.jar");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		WebElement user = driver.findElement(By.id("twotabsearchtextbox"));
		user.click();
		
		WebElement txt = driver.findElement(By.name("field-keywords"));
		txt.sendKeys("iphone 14");
		
		WebElement user1 = driver.findElement(By.id("nav-search-submit-button"));
		user1.click();
		
	}

}
