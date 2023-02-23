package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn 
{
	@FindBy (xpath="//span[@id='nav-link-accountList-nav-line-1']")
    private WebElement SignIN ;

  	@FindBy (xpath="//input[@type='email']")
    private WebElement MobNo;                       
  
	@FindBy (xpath="//input[@id='continue']")
    private WebElement Continue;
  
	@FindBy (xpath="//a[@id='createAccountSubmit']")
    private WebElement CreateNewAcc;
  
	
 //Constructor
    
    public SignIn( WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    
    //Methods
  public void SignIN() {
	  SignIN.click();
  }
  
  public void MobNo() {
	  MobNo.sendKeys("9922308009");
  }
   
  public void Continue() {
	  Continue.click();
  }
  
  public void CreateNewAcc() {
	  CreateNewAcc.click();
  }
}




