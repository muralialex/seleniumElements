package dharani;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestAssigment {
	public static void main(String[] args) {
		System.setProperty("driver.chrome.driver", System.getProperty("user.dir") + "/src/main/resource/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://yahoo.in");//Goto https://yahoo.in
		driver.findElement(By.xpath("//input[@placeholder='Search the web']")).sendKeys("Hello");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
		
		
		//Get all the Text values from the Auto suggestion
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@class='sa-list']//li"));
		for(WebElement list:lists)
		{
			System.out.println(list.getText());
		}
		
		//Get all the "id" attribute values from the Auto suggestion
		
		for(int i=0; i<lists.size(); i++)
		{
			System.out.println(lists.get(i).getAttribute("role"));
		}
		
		//Click on the First suggestion
		lists.get(0).click();
		
		//Compare the values with the next page, does it contain
		
		   String text = driver.findElement(By.xpath("//input[@id='yschsp']")).getText();
		   
		String text2 = driver.findElement(By.xpath("//div[contains(@class,'txt d-f')]/span[1]")).getText();
		
		if(text.equalsIgnoreCase(text2))
			System.out.println("The Str1 val is same as str2 --- "); 
		else
			System.out.println("comparision unsuccessful");
		
		//Navigate back to homepage  
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@placeholder='Search the web']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search the web']")).sendKeys("Hello");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
		
		//Click on the "Hello Kitty" from the suggestion 
		driver.findElement(By.xpath("//li[@id='sa-item2']/span[1]")).click();
		
		String text3 = driver.findElement(By.xpath("//input[@value='hello kitty']")).getText();
		String text4 = driver.findElement(By.xpath("//span[text()='Hello Kitty']")).getText();
		if(text3.equalsIgnoreCase(text4))
			System.out.println("comparision successful");
		else
			System.out.println("comparision unsuccessful");
		//Navigate back to homepage 
		
		driver.navigate().back();

		driver.findElement(By.xpath("//input[@placeholder='Search the web']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search the web']")).sendKeys("Hello");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']")));
		 
		//Create a loop and do the same action from the first element to last element
		
		System.out.println("Create a loop and do the same action from the first element to last element");
		
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@class='sa-list']//li"));
		//for(WebElement element:findElements)
		
			for(int i=0;i<findElements.size();i++) {
				WebElement q = findElements.get(i);
				System.out.println(q.getText());
		
		}
		for(WebElement j:findElements)
		{
			System.out.println(j.getText());
		}
		
		
	}
		

		
		
 	 
	
	


}
