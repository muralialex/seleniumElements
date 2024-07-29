package Annu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Login_Acttime {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/intuisyz2");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("annuralhan6@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("hRDvdQ5J");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.linkText("Logout")).click();
	}
}
