package elements;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Screenshots {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver_126.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/cisco1/login.do");
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\resources\\screenshots\\screenshot_FullPage.png"));
		
		file = driver.findElement(By.id("logoContainer")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\resources\\screenshots\\screenshot_logo.png"));
		
		file = driver.findElement(By.xpath("//td[@id='logoContainer']/ancestor::table[position()=1]")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\resources\\screenshots\\screenshot_table.png"));
		
		file = driver.findElement(By.xpath("//td[text()='Please identify yourself']/ancestor::table[1]")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\resources\\screenshots\\screenshot_userNameField.png"));
		
		
	}
}
