package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class MouseMovements_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		driver.switchTo().window(driver.getWindowHandle());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement textbox = driver.findElement(By.id("age"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(textbox).build().perform();
		String toolTip= driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println(toolTip);
		driver.switchTo().window(driver.getWindowHandle());
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.id("draggable"))).build().perform();
		action.clickAndHold().build().perform();
		action.moveByOffset(100, 150).build().perform();
		action.release().build().perform();
		
	}
}
