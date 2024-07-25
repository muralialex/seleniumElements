package elements;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Handling_BasicElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco1/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("z$uYsEUh");
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
	}
}
