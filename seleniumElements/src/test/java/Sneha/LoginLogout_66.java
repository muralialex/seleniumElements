package Sneha;

import java.time.Duration;
//Assignmnt Class 66
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Assignment 66-Login to Actitime
Goto Tasks module
get the text of first task in the table
search for the task in the Searchbox
print the status of the task
Logout from actitime  */


class LoginLogout_66 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/chromedriver_126.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://online.actitime.com/ib1/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("snehaalysha1812@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("Anki@1705!");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("container_tasks")).click();
		String taskname=driver.findElement(By.xpath("//div[@class='namesContainer'][position()=1]/div/following-sibling::div")).getText();
		driver.findElement(By.xpath("//input[@class='components-SearchInput-searchInput--dlqxQrkh components-SearchInput-empty--TyuRV3fG']")).sendKeys(taskname);
		String taskstatus=driver.findElement(By.xpath("//td[@class='status']//div[@class='name']")).getText();
		System.out.println(taskstatus);
		Thread.sleep(2000);
		driver.findElement(By.id("logoutLink")).click();
	}}
