package Anisha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class loginlogout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/ispace/login.do");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("paridaanisha123@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Sairam@08");
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}

}
