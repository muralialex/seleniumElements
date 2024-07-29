package dharani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrawAndDropAndSlider {

	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resource/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.findElement(By.linkText("Droppable")).click();
		Actions action = new Actions(driver);

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement to = driver.findElement(By.xpath("//div[@id='draggable']/following-sibling::div[1]"));
		action.dragAndDrop(from, to).build().perform();

		;
		System.out.println("slider");
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.linkText("Slider")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span[1]"));
		action.dragAndDropBy(slider, 150, 50).build().perform();
		// action.dragAndDropBy(slider, 0, 50).build().perform();

	}

}
