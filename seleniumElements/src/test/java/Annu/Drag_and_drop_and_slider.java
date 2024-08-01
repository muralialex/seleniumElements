package Annu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

class Drag_and_drop_and_slider {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); // To disable the notifications
		options.addArguments("force-device-scale-factor=0.90");
		options.addArguments("high-dpi-support=0.90");

		System.setProperty("WebDriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		// Drag an element and drop in another element
		driver.findElement(By.linkText("Droppable")).click();
		// driver.switchTo().frame(0);
		// driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build()
				.perform();

		//Drag and drop the slider
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Slider")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		action.dragAndDropBy(driver.findElement(By.id("slider")), 150, 0).build().perform();
		Thread.sleep(2000);
		action.dragAndDropBy(driver.findElement(By.id("slider")), 40, 0).build().perform();
		
		
	}

}
