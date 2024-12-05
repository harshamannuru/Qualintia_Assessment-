package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPom {
	WebDriver driver;
	
	//Constructor 
	public SigninPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	//Elements Finding 
	@FindBy(xpath="(//li[@class='authorization-link'])[1]/a")
	WebElement signin;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement password;
	//@FindBy(xpath="//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	@FindBy(xpath="(//button[@id='send2']/span)[1]")
	WebElement signinbtn;
	
	
	//Corresponding actions 
	public void signinlink() {
		signin.click();
	}
	public void enterdetails(String mail,String pass) {
		email.sendKeys(mail);
		password.sendKeys(pass);
	}
	public void signinbutton() {
		signinbtn.click();
	}
}
