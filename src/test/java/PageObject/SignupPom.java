package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPom {
	WebDriver driver;

	//Constructor
	public SignupPom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Elements Finding 
	@FindBy(xpath="//div[@class='panel header']/ul/li[3]/a")
	WebElement createaccountlink;
	@FindBy(xpath="//input[@id='firstname']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='lastname']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='email_address']")
	WebElement email;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//input[@id='password-confirmation']")
	WebElement confirmpassword;
	@FindBy(xpath="//button[@class='action submit primary']")
	WebElement createaccountbtn;
	
	//Actions 

	public void createaccountlink() {
		createaccountlink.click();
	}
	public void setfirstnameandlastname(String fname,String lname) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
	}
	public void setemailpasswordandconfirmpassword(String mail,String pass,String cpass) {
		email.sendKeys(mail);
		password.sendKeys(pass);
		confirmpassword.sendKeys(cpass);
	}
	public void createaccount() {
		createaccountbtn.click();
	}
}
