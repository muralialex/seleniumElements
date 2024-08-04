package Annu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Assignment1_Flipcart_Header {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver",
				System.getProperty("user.dir") + "src\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/ ");
		driver.manage().window().maximize();
		
		List<WebElement> headers = driver.findElements(By.xpath("//div[@class='_3sdu8W emupdz']/*"));
		int count = headers.size();
		System.out.println("Number of headers: " + count);
		System.out.println();
		
		for (WebElement option : headers) {
		    System.out.println(option.getText());
		}
	}

}
