package org.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {
	
	public static void main(String[]args) {
		
		System.setProperty("WebDriver.ChromeDriver","C:\\Users\\HAVOC\\eclipse-workspace\\Automation\\library\\selenium-server-4.25.0.jar");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
		
		driver.get("https://www.facebook.com/login/");
		
		
		WebElement user = driver.findElement(By.name("email"));
		user.sendKeys("kamaraj");
		
		WebElement key = driver.findElement(By.id("pass"));
		key.sendKeys("80071");
		
		WebElement button = driver.findElement(By.name("login"));
		button.click();
		
		
	}
	
}
