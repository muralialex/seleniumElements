package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BasicsSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco1");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("unique.muralistl@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("z$uYsEUh");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.className("initial")).click();
		
	}
}
