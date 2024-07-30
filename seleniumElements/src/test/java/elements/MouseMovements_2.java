package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class MouseMovements_2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.linkText("Slider")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		action.dragAndDropBy(driver.findElement(By.id("slider")), 100, 0).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(driver.findElement(By.id("slider")), 50, 0).build().perform();
		
	}
}
