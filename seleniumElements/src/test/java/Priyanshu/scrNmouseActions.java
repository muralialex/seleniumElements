package Priyanshu;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class scrNmouseActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\src\\resources\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");
		//force zoom level on all pages from get go -- ZOOMED OUT PAGE TO AVOID MOVE OUT OF BOUND ERROR
		options.addArguments("force-device-scale-factor=0.90");
		options.addArguments("high-dpi-support=0.90");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/"); //open browser , works on with fresh browser
		driver.manage().window().maximize(); //maximize window
		 System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Demos")).click();
		//refresh page
		driver.navigate().refresh();
		//back to homepage
		driver.navigate().back();
		Thread.sleep(2000);
		//go back to demo page
		driver.navigate().forward();
		System.out.println("Back to demos page for screenshot");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//take scrshot of page
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\src\\resources\\screenshots\\Demosscreen.png"));
		Thread.sleep(2000);
		//back again to homepage
		driver.navigate().back();
		System.out.println("Back to the homepage");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("banner-secondary"));
		File elementscrShot = driver.findElement(By.id("banner-secondary")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(elementscrShot, new File(System.getProperty("user.dir") + "\\src\\resources\\screenshots\\homeelement.png"));
		//rightclick
		Actions actions = new Actions(driver);
//		WebElement elementToRightClick = driver.findElement(By.linkText("About"));
//		actions.contextClick(elementToRightClick).perform();
//		Thread.sleep(2000);
		//tooltip
		driver.findElement(By.linkText("Tooltip")).click();
//		SWITCH TO IFRAME SO ELEMENT CAN BE LOCATED 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		System.out.println("IN iframe");
		Thread.sleep(2000);
//		Or
//		driver.switchTo().frame(0);// only if 1 frame is present
//		driver.findElement(By.id("age")).click();
		WebElement elementToMoveTo = driver.findElement(By.id("age"));
		actions.moveToElement(elementToMoveTo).build().perform();
		Thread.sleep(3000);
		System.out.println("Clicking draggable");
//		SWITCH BACK TO WEBPAGE 
		driver.switchTo().window(driver.getWindowHandle());
		//draganddrop
		driver.findElement(By.linkText("Draggable")).click();
		System.out.println("Dragand drop action");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		actions.moveToElement(driver.findElement(By.id("draggable"))).build().perform();
		actions.clickAndHold().build().perform();
		actions.moveByOffset(100,150).build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		//droppable
		driver.findElement(By.linkText("Droppable")).click();
		System.out.println("droppable action");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		actions.moveToElement(driver.findElement(By.id("draggable"))).build().perform();
		actions.clickAndHold().build().perform();
		actions.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		//slider
		driver.findElement(By.linkText("Slider")).click();
		System.out.println("slider action");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		actions.moveToElement(driver.findElement(By.xpath("//div[@id = 'slider']/span[contains(@class,'ui-slider-handle')]"))).build().perform();
		actions.clickAndHold().build().perform();
		actions.moveByOffset(200,0).build().perform();
		actions.release().build().perform();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		driver.close();
	}

}
