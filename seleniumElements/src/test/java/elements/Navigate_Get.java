package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Navigate_Get {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco1/login.do");
		Thread.sleep(3000); //Blind Wait
		driver.navigate().to("https://google.co.in");
		Thread.sleep(3000); //Blind Wait
		driver.navigate().to("https://online.actitime.com/cisco1/login.do");
		Thread.sleep(3000); 
		driver.close();
		
	}
}
