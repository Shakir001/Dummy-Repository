package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://lab-uat-ui.s3-website.ap-south-1.amazonaws.com");
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo_lab_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demo_lab_user");
		driver.findElement(By.xpath("//input[@id='kc-login']")).click();
		driver.findElement(By.xpath("//div[text()='PREMIX']/../../descendant::p[text()='All']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-rowindex='9']/div[3]")).click();
		driver.findElement(By.xpath("//p[text()='Lab Test Details']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @data-testid=\"AddCircleOutlineIcon\"]")).click();
		
	}
}
