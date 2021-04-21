package Com.Infomats.Mercury.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Infomats.Mercury.Base.TestBase;

public class SignupPage extends TestBase
{
	@FindBy(xpath="//a[@href='register.php']")
	WebElement Register;
	
	@FindBy(name="firstName")
	WebElement Firstname;
	
	@FindBy(name="lastName")
	WebElement Lastname;
	
	@FindBy(name="phone")
	WebElement Phonenum;
	
	@FindBy(name="userName")
	WebElement Email;
	
	@FindBy(name="address1")
	WebElement Adres;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="postalCode")
	WebElement Postalcode;
	
	@FindBy(name="country")
	WebElement Country;
	
	@FindBy(id="email")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmPassword")
	WebElement Confirmpass;
	
	@FindBy(name="submit")
	WebElement Submit;
	
	@FindBy(xpath="//a[@href='login.php']")
	WebElement SignOn;
	
	@FindBy(xpath="//input[@name='userName']")
	WebElement SiUser;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement SiPas;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement Sigsub;
	
	@FindBy(xpath="//a[@href='index.php']")
	WebElement Signof;
	
	public SignupPage()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	public void verifyRegister()
	{
		Register.click();
	}
	public void verifyFirstname(String name)
	{
	 Firstname.sendKeys(name);
	}
	public void verifyLastname(String name)
	{
		Lastname.sendKeys(name);
	}
	public void verifyPhonenum(String number)
	{
		Phonenum.sendKeys(number);
	}
	public void verifyEmail(String name)
	{
		Email.sendKeys(name);
	}
	public void verifyAdres(String name)
	{
		Adres.sendKeys(name);
	}
	public void verifyCity(String name)
	{
		City.sendKeys(name);
	}
	public void verifyState(String name)
	{
		State.sendKeys(name);
	}
	public void verifyPostalcode(String number)
	{
		Postalcode.sendKeys(number);
	}
	public void verifyCountry(String name)
	{
		Country.sendKeys(name);
	}
	public void verifyUserName(String name)
	{
		UserName.sendKeys(name);
	}
	public void verifyPassword(String number)
	{
		Password.sendKeys(number);
	}
	public void verifyConfirmpass(String name)
	{
		Confirmpass.sendKeys(name);
	}
	public void verifySubmit()
	{
		Submit.click();
	}
	public void verifySignOn()
	{
		SignOn.click();
	}
	public void verifySiUser(String name)
	{
		SiUser.sendKeys(name);
	}
	
	public void verifySipas(String number)
	{
		SiPas.sendKeys(number);
	}
	public void verifySigsub()
	{
		Sigsub.click();
	}
	public void verifySignof()
	{
		Signof.click();
	}
}
