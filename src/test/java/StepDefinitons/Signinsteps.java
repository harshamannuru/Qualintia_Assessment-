package StepDefinitons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.SigninPom;
import io.cucumber.java.en.*;

public class Signinsteps {

	public static WebDriver driver;
	SigninPom signinpom;
	@Given("browser is opene")
	public void browser_is_opene() {
		driver=new ChromeDriver();


	}

	@Given("User is available in the signin page")
	public void user_is_available_in_the_signin_page() {
		signinpom=new SigninPom(driver);
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		signinpom.signinlink();
	}

	@When("User enters the email and password")
	public void user_enters_the_email_and_password() {
		signinpom.enterdetails("harshamannuru@gmail.com", "Harsha@143");
	}

	@When("User clicks the signin button")
	public void user_clicks_the_signin_button() throws InterruptedException {
		Thread.sleep(2000);
		signinpom.signinbutton();
	}

	@Then("User is navigated to dashboard page")
	public void user_is_navigated_to_dashboard_page() {
     
		
		String Act_title= driver.getTitle();
		String Exp_title="Home Page";
		
		if(Act_title.equals(Exp_title)) {
			
			System.out.println("Test case pass");
		}
		else {
			
			System.out.println("Test case Fail");
		}
	}



}