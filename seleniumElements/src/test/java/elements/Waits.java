package elements;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

class Waits {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\MyData\\JavaSelenium\\SelJarFiles\\Drivers\\chrome\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco1/login.do");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("z$uYsEUh");
		driver.findElement(By.id("loginButton")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'WeekPicker-arrow')][last()]/*[name()='svg']")));
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
		        .withTimeout(Duration.ofSeconds(10))
		        .pollingEvery(Duration.ofSeconds(3))
		        .ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@class,'WeekPicker-arrow')][last()]/*[name()='svg']")));
		
		driver.findElement(By.xpath("//span[contains(@class,'WeekPicker-arrow')][last()]/*[name()='svg']")).click();
		
		
	}
}
