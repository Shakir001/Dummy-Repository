package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.backend.Container;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ec2-3-6-40-132.ap-south-1.compute.amazonaws.com:8443/realms/RiceFortification/protocol/openid-connect/auth?client_id=react-ui&redirect_uri=http%3A%2F%2Ffortification-uat-ui.s3-website.ap-south-1.amazonaws.com%2F&state=490f679c-7016-4903-8036-6a17a5776a44&response_mode=fragment&response_type=code&scope=openid&nonce=a03896bc-ebfb-489d-838b-623d464a1cd6&code_challenge=AvpbvGgvrtBjnRE-VDU3UfiLcw-JBIYOhsThOKurWd4&code_challenge_method=S256");
		driver.findElement(By.xpath("//button[@id='details-button']")).click();
		driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demo_milleruser");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("demo_milleruser");
		driver.findElement(By.xpath("//input[@id='kc-login']")).click();
		driver.findElement(By.xpath("//div[text()='MILLER']/../../descendant::div[text()='BATCH']")).click();
		driver.findElement(By.xpath("//div[@role=\"presentation\"]/descendant::span[text()='Created']")).click();
		driver.findElement(By.xpath("//button[text()='Self certified']")).click();
		driver.findElement(By.xpath("//td[contains(.,'Moisture Content %')]/../descendant::input[@id='outlined-basic']")).sendKeys("10");
		
		driver.findElement(By.xpath("//div[@id=\"table\"]/table/tbody/descendant::td[position()=5]/descendant::input")).sendKeys("java");
		
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./Screen/shot.png");
//		try {
//			FileUtils.copyFile(src, dest);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

		
	}
}
