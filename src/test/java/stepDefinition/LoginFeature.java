package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeature {
	 
	  @Before(order=1)
	  public void setUp(){
		System.out.println("Before Test1");
	  }
	  
	  @After(order=1)
	  public void closeBrowser() {
		  System.out.println("Test Closed1");
	  }
	 
	  
	  @Before(order=2)
	  public void setUp2(){
		System.out.println("Before Test2");
	  }
	  
	  @After(order=2)
	  public void closeBrowser2() {
		  System.out.println("Test Closed2");
	  }
	 //if we have multiple methods @before @after we need to give preference order of execution
	  
	  
	  @BeforeStep
	  public void beforeStep() {
		  System.out.println("For every step execute it");
	  }
	  
	  @AfterStep
	  public void afterStep() {
		  //code after execution of a step
		  //to take screenshot of each step
	  }
	  
	  
		WebDriver driver;
		
		@Given("open the browser")
		public void openBrowser()
		{
			driver = new ChromeDriver();
		}
		
		
		@Given("user navigate the url {string}")
		public void user_navigate_the_url(String url) {
		    // Write code here that turns the phrase above into concrete actions
			driver.get(url);
		}

		@When("user enter valid username {string}")
		public void user_enter_valid_username(String user) {
			
			//1.find the webElement
			//2.send keys
			
			driver.findElement(By.id("username")).sendKeys(user);
		}

		@When("user enter valid password {string}")
		public void user_enter_valid_password(String pass) {
			
			driver.findElement(By.id("password")).sendKeys(pass);
            
		}

		@When("user clicks on login")
		public void user_clicks_on_login() {  
			//driver.findElement(By.xpath("//button[text()='Login']")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();		
			//button[@type='submit'] or //button[contains(text(),'Login')]
		}

		@Then("user will be redirected to logout page {string}")
		public void user_will_be_redirected_to_logout_page(String ExpTitle) {
		    String actTitle = driver.getTitle();
		    Assert.assertEquals(actTitle, ExpTitle);
		}
       
		
		
		@Given("open firefox")
		public void openFf() 
		{
			driver = new EdgeDriver();
		}
		@Then("user closes the browser") 
		public void closeTheBrowser() {
			driver.close();
		
		}
	   
		@Then("user closes the  chrome browser")
		public void user_closes_the_chrome_browser() {
		    // Write code here that turns the phrase above into concrete actions
		    System.out.println("Last step ###########");
		}
		}

