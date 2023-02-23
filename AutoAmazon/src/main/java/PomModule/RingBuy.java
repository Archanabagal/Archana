package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RingBuy 
{
	@FindBy (xpath="//input[@type='text']")
    private WebElement SearchBox ;

	@FindBy (xpath="//input[@type='submit']")
    private WebElement SearchButton;
	
	@FindBy (xpath="(//img[@class='s-image'])[3]")
    private WebElement RingImage;
	
	@FindBy (xpath="//input[@id='add-to-cart-button']")
    private WebElement AddToCart;
	
	@FindBy (xpath="//input[@id='buy-now-button']")
    private WebElement BuyNow;
  
	@FindBy (xpath="//a[@title='Add to Wish List']")
    private WebElement AddToWishlist;
  
	
 //Constructor
    
    public   RingBuy( WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    
    //Methods
    
    public void  SearchBox() {
    	
    	SearchBox.click();
  }

    public void SearchButton() {
    	SearchButton.click();
    }
    public void AddToCart() {
    	AddToCart.click();
    }
    public void BuyNow() {
    	BuyNow.click();
  	  }
      public void AddToWishlist() {
    	  AddToWishlist.click();
    }
      
}



