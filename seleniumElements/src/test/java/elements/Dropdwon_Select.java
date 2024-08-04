package elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Dropdwon_Select {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("iframeResult");
		Select dropdown = new Select(driver.findElement(By.id("cars")));
		dropdown.selectByIndex(3);
		Thread.sleep(3000);
		dropdown.selectByValue("saab");
		Thread.sleep(3000);
		dropdown.selectByVisibleText("Opel");
		
		List<WebElement> values=dropdown.getOptions();
		for(WebElement val:values) {
			System.out.println("Text=> "+val.getText());
			System.out.println("value=> "+val.getAttribute("value"));
		}
		System.out.println("=====");
		for(int i= 0; i<values.size(); i++) {
			System.out.println("Text=> "+values.get(i).getText());
		}
		
		
	}
}
