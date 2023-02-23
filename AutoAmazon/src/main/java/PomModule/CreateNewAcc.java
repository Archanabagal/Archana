package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewAcc 
{
	@FindBy (xpath="//input[@type='text']")
    private WebElement Name ;
	
	@FindBy (xpath="//input[@type='tel']")
    private WebElement MobNo;
	
	@FindBy (xpath="//input[@type='password']")
    private WebElement Password;
  
	@FindBy (xpath="//input[@id='continue']")
    private WebElement Continue;
 
	
 //Constructor
	public CreateNewAcc( WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	    
    
    //Methods
    
 

  public void Name() {
	 
	  Name.sendKeys("Archana Bagal");
  }
  public void  MobNo() {
	 
	  MobNo.sendKeys("9284362053");
	  
  }

  public void Password() {
	  
	  Password.sendKeys("archana18");
	  }
  
  public void Continue() {
	  Continue.click();
	  }
}



