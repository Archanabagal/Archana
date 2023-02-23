package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomModule.SignIn;

public class TestClass1 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32_1\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
	  //   WebDriver driver = new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     driver.manage().window().maximize();

	     driver.get("https://www.amazon.in/");
	     
	     SignIn  signIn = new SignIn(driver);
	     
	     
	     signIn.SignIN();
	     signIn.MobNo();
	     signIn.Continue();
	     signIn.CreateNewAcc();


	}
	}


