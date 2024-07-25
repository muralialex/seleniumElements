package elements;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[contains(text(),'FLIGHTS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'BUSES')]")).click();
		Set<String> winIds= driver.getWindowHandles();
		Iterator<String> itr= winIds.iterator();
		String fWinID= itr.next();
		String sWinID= itr.next();
		driver.switchTo().window(sWinID);
//		driver.findElement(By.id("defenceForce")).click();
		driver.switchTo().window(fWinID);
		driver.findElement(By.xpath("//label[text()='Person With Disability Concession']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'confirmdialog')]")).click();
		driver.close();
		driver.quit();
		
		
		
//		Thread.sleep(5000); //Blind Wait
//		driver.close();
	}

}
