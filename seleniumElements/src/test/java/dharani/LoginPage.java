package dharani;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver.chrome.driver",
				System.getProperty("user.dir") + "src/main/resource/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/hcl/login.do");
		driver.findElement(By.name("username")).sendKeys("dharanigavireddy@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("2Eb7D$aj");
		// driver.get("https://online.actitime.com/cisco1/login.do");
	

		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(3000);
		
		System.out.println("done by login");
		//driver.findElement(By.xpath("//a[contains(text(),'Tasks')]"));
		//driver.findElement(By.xpath("//a[contains(@class,'content selected')]")).click();
		driver.findElement(By.xpath("//table[@id='topnav']/tbody[1]/tr[1]/td[4]/a[1]")).click();
		//driver.findElement(By.xpath("//a[@class='content selected tasks']")).click();
		//driver.findElement(By.xpath("//body[contains(@class,'task_list with-navigation')]")).click();
		System.out.println("open tasks");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='components-SearchInput-searchInput--dlqxQrkh components-SearchInput-empty--TyuRV3fG']"));
		System.out.println("open serach");
		driver.findElement(By.xpath("//div[text()='Bug fixing']"));
		driver.findElement(By.xpath("//div[text()='Done']"));
		driver.close();
		
		
		
	}
}