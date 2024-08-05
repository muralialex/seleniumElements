package Annu;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Assign_mousehover_dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver",
				System.getProperty("user.dir") + "src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/css/tryit.asp?filename=trycss_dropdown_button");

		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		// action.moveToElement(driver.findElement(By.xpath("//button[text()='Dropdown']"))).build().perform();

		WebElement textbox = driver.findElement(By.className("dropdown"));

		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(textbox).build().perform();

		List<WebElement> options = driver.findElements(By.xpath("//div[@class='dropdown-content']"));

		// Print the options
		for (WebElement option : options) {
			System.out.println(option.getText());
		}

	}

}
