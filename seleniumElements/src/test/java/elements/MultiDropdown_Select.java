package elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class MultiDropdown_Select {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("iframeResult");
		Select dropdown = new Select(driver.findElement(By.id("cars")));
		dropdown.selectByIndex(0);
		dropdown.selectByIndex(1);
		dropdown.selectByIndex(2);
		
		List<WebElement> selected_values = dropdown.getAllSelectedOptions();
		for(WebElement val:selected_values) {
			System.out.println(val.getText());
		}
		System.out.println("====");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	}
}
