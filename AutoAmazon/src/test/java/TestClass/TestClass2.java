package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomModule.CreateNewAcc;
import PomModule.SignIn;

public class TestClass2 
{
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SWAPNIL\\Desktop\\Archana\\Automation\\Selenium\\chromedriver_win32 (3)\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         driver.manage().window().maximize();

	     driver.get("https://www.amazon.in/");
	    Thread.sleep(3000);
	     
	     SignIn  signIn = new SignIn(driver);
	    
	     signIn.CreateNewAcc();
	     CreateNewAcc createNewAcc = new CreateNewAcc(driver);
	     
	     createNewAcc.Name(); 
	     createNewAcc.MobNo();
	     createNewAcc.Password();
	     createNewAcc.Continue();
	     
	     
}
}

