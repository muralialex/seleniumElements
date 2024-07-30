package Annu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

class Mouse_movements {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); //To disable the notifications
		options.addArguments("force-device-scale-factor=0.90");
		options.addArguments("high-dpi-support=0.90");

		System.setProperty("WebDriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);        //Switching to frame
		//driver.switchTo().defaultContent();//Switching to main webpage
		//driver.switchTo().window(driver.getWindowHandle());
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement textbox=driver.findElement(By.id("age"));
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.moveToElement(textbox).build().perform();
		
		String toolTip= driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println(toolTip);                   //Printing tooltip
		
		driver.switchTo().defaultContent();
		//driver.switchTo().window(driver.getWindowHandle());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		action.moveToElement(driver.findElement(By.id("draggable"))).build().perform();
		action.clickAndHold().build().perform();
		action.moveByOffset(100,150).build().perform();
		action.release().build().perform();
	
		
	}
	}

}
