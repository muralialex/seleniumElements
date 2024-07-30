package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class AutoSuggest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Hello");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li[1]")));
		driver.findElement(By.xpath("//ul[@role='listbox']//li[1]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Google offered')]")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@aria-label='Search']")));
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("Welcome");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Welcome Home']/ancestor::li")));
		driver.findElement(By.xpath("//*[text()='Welcome Home']/ancestor::li")).click();
		
		
	}
}
