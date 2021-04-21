package Com.Infomats.Mercury.Script;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Infomats.Mercury.Base.TestBase;
import Com.Infomats.Mercury.Pages.SignupPage;

public class TestScript extends TestBase
{
    SignupPage log;
	
	@BeforeTest(alwaysRun =true)
	public void setup()
	{
		open();
		log=new SignupPage();
	}

	@Test(priority = 1)
	public void validateRegister()
	{
	log.verifyRegister();
	}
	@Test(priority = 2)
	public void validateFirstname()
	{
	log.verifyFirstname("varathan");
	}
	@Test(priority = 3)
	public void validateLastname()
	{
	log.verifyLastname("G");
	}
	@Test(priority = 4)
	public void validatePhonenum()
	{
	log.verifyPhonenum("9952526188");
	}
	@Test(priority = 5)
	public void validateEmail()
	{
		log.verifyEmail("ipsjayathekaiser@gmail.com");
	}
	@Test(priority = 6)
	public void validateAdres()
	{
		log.verifyAdres("Ambattur");
	}
	@Test(priority = 7)
	public void validateCity()
	{
		log.verifyCity("Chennai");
	}
	@Test(priority = 8)
	public void validateState()
	{
		log.verifyState("Tamilnadu");
	}
	@Test(priority = 9)
	public void validatePostalcode()
	{
		log.verifyPostalcode("600053");
	}
	@Test(priority = 10)
	public void validateCountry()
	{
		log.verifyCountry("India");
	}
	@Test(priority = 11)
	public void validateUserName()
	{
		log.verifyUserName("varathan");
	}
	@Test(priority = 12)
	public void validatePassword()
	{
		log.verifyPassword("33336666");
	}
	@Test(priority = 13)
	public void validateConfirmpass()
	{
		log.verifyConfirmpass("33336666");
	}
	@Test(priority = 14)
	public void validateSubmit()
	{
	   log.verifySubmit();
	}
	@Test(priority = 15)
	public void validateSignOn()
	{
		log.verifySignOn();
	}
	@Test(priority = 16)
	public void validateSiUser()
	{
		log.verifySiUser("varathan");
	}
	@Test(priority = 17)
	public void validateSipas()
	{
		log.verifySipas("33336666");
	}
	@Test(priority = 18)
	public void validateSigsub()
	{
		log.verifySigsub();
	}
	@Test(priority = 19)
	public void validateSignof()
	{
		log.verifySignof();
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
