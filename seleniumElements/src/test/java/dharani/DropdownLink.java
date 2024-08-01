package dharani;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownLink {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver",
				System.getProperty("user.dir") + "src/main/resource/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_dropdown_button");
		driver.switchTo().frame("iframeResult");
		//WebElement findElement = driver.findElement(By.xpath("//div[@class='dropdown']//div[1]"));
		WebElement findElement = driver.findElement(By.xpath("//button[text()='Dropdown']"));
		Actions action =new Actions(driver);
		action.moveToElement(findElement).build().perform();
		
		
	}

}
