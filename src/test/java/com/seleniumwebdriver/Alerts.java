package com.seleniumwebdriver;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		System.out.println(alert.getText());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		alert.accept();

	}

}
