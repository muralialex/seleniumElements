package Priyanshu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class priyanshuLoginlogoutGit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\resources\\chromedriver_126.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/na11/login.do"); //open browser , works on with fresh browser
		driver.manage().window().maximize(); //maximize window
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("canadasun911@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("TRASH@121");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		driver.close(); //only closes the current browser in multiple browser scenario
		driver.quit(); //closes all browser in multiple browser scenario
	}

}
