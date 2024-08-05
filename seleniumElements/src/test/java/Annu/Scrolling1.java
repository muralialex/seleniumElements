package Annu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Scrolling1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				System.getProperty("user.dir") + "src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		driver.findElement(By.linkText("Draggable")).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElement(By.linkText("Position")));
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-400)", "");
		Thread.sleep(3000);

		
	}

}
