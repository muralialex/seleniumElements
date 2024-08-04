package Giri;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Giriacttimlogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/dst/login.do"); //open browser , works on with fresh browser
		driver.manage().window().maximize(); //maximize window
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("gbrahama@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Dhanush1234$");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		driver.close(); //only closes the current browser in multiple browser scenario
		driver.quit(); //closes all browser in multiple browser scenario
	}

}
