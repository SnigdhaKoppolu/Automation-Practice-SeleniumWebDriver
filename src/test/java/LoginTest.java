import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	
	@Test
	public void loginTestWithValidCred() {
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		//1. find web-element(username)
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		
		//2. find webelement(password)
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		
		//3. find login webelement (login)
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		
		//Actions
		username.sendKeys("practice");
		pass.sendKeys("SuperSecretPassword!");		
		login.click();
		
		
	}
}
