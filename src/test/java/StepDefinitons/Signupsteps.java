package StepDefinitons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.SignupPom;
import io.cucumber.java.en.*;

public class Signupsteps {
	public static WebDriver driver;
	SignupPom signuppom;
	
	
	@Given("Browser is opened")
	public void browser_is_opened() {
	    driver=new ChromeDriver();
	}

	@Given("User is available in the create a new account page")
	public void user_is_available_in_the_create_a_new_account_page() throws InterruptedException {
	    driver.get("https://magento.softwaretestingboard.com/");
	    signuppom=new SignupPom(driver);
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    signuppom.createaccountlink();
	    
	}
	@When("User enters the First name and Last name")
	public void user_enters_the_first_name_and_last_name() {
	signuppom.setfirstnameandlastname("Harsha", "Mannuru");
	}

	@When("User enters the Email, Password and Confirm Password")
	public void user_enters_the_email_password_and_confirm_password() {
	   signuppom.setemailpasswordandconfirmpassword("h@gmail.com", "Harsha@123", "Harsha@123");
	}

	@When("User clicks the Create an account button")
	public void user_clicks_the_create_an_account_button() {
	  signuppom.createaccount();
	}

	@Then("User is successfully completed Signup functionality")
	public void user_is_successfully_completed_signup_functionality() {
		String Act_title=driver.getTitle();
		String Exp_title="My Account";
		
		if(Act_title.equals(Exp_title)) {
			
			
			System.out.println("Test case passed");
		}
		
		else {
			System.out.println("Testcase is failed");
			
		}
	}

	@Then("User is navigated to Account information page")
	public void user_is_navigated_to_account_information_page() {

	}
}
