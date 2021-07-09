package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef {

	
	WebDriver driver;
	
	@Given("User is on facebook Site.")
	public void user_is_on_facebook_site() {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\app\\3.141.5\\chromedriver\\chromedriver.exe");

		driver=new ChromeDriver();
		
     driver.get("http://v80426rt.nonprod.hclpnp.com/webapp/wcs/stores/servlet/en/auroraesite");
     
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     
     //driver.manage().window().fullscreen();
     
    
    
    
	    
	}

	@When("Enter <username> and <password>.")
	public void enter_username_and_password() {
		//System.setProperty("webdriver.chrome.driver", "C:\\app\\3.141.5\\chromedriver\\chromedriver.exe");

		
		driver.findElement(By.xpath("//a[@id='Header_GlobalLogin_signInQuickLink']")).click();
	    
	    driver.findElement(By.xpath("//input[@name='logonId']")).sendKeys("oms1");
	    
	    driver.findElement(By.xpath("//input[@name='logonPassword']")).sendKeys("oms@1234");
	}

	@And("click on submit button.")
	public void click_on_submit_button() {
		//System.setProperty("webdriver.chrome.driver", "C:\\app\\3.141.5\\chromedriver\\chromedriver.exe");

		
		driver.findElement(By.xpath("(//div[@class='button_text'])[1]")).click();
	   
	}

	@Then("User successfully logged into home page.")
	public void user_successfully_logged_into_home_page() {
		//System.setProperty("webdriver.chrome.driver", "C:\\app\\3.141.5\\chromedriver\\chromedriver.exe");

		
		System.out.println("Wow! Successfully logged In");
	   
	}
}
