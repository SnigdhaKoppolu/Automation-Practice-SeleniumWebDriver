import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeSetup {

	public static void main(String[] args) {
ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--headless=new"); 
        
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
        

	}

}
