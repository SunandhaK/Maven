package Com.Infomats.Mercury.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Com.Infomats.Mercury.Utils.TestUtil;


public class TestBase
{
	File f;
	FileInputStream fis;
	Properties pro;
   public static WebDriver driver;

   public TestBase()
   {
	   try
	   {
		   f=new File("./src/main/java/Com/Infomats/Mercury/Config/ConfigProperties");
		   fis=new FileInputStream(f);
		   pro=new Properties();
		   pro.load(fis);
	   }
	   catch (Exception e)
	   {

		   System.out.println(e.getMessage());
	   }
   }
   public void open()
   {
	   String browser=pro.getProperty("Browsername");
	   if (browser.equalsIgnoreCase("Chrome"))
	   {
		  // WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", pro.getProperty("Chromepath"));
		driver=new ChromeDriver();
     	}
	   else
		   if (browser.equalsIgnoreCase(""))
		   {
			   System.setProperty("webdriver.gecko.driver",pro.getProperty("geckopath"));
			   driver=new FirefoxDriver();
		   }
        
	   else
	   {
		System.out.println("given browser name is wrong");   
	   }
	   driver.get(pro.getProperty("url"));
	   TestUtil.max();
	   TestUtil.implicit();
	   TestUtil.screenshot();
   }
}
