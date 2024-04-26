package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {

	@FindBy(name = "removefromcart")
	private WebElement removeFromCart;
	
	@FindBy(name = "addtocart")
	private WebElement addToCart;
	
	@FindBy(name = "updatecart")
	private WebElement updateCart;
	
	@FindBy(name = "addtocartbutton")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement emailFriend;
	
	@FindBy(xpath = "//a[@href='/fiction-ex']")
	private WebElement fictionFXProduct;
	
	
	public WishlistPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getRemoveFromCart() {
		return removeFromCart;
	}

	

	public WebElement getAddToCart() {
		return addToCart;
	}

	

	public WebElement getUpdateCart() {
		return updateCart;
	}

	

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	
	public WebElement getEmailFriend() {
		return emailFriend;
	}

	public WebElement getFictionFXProduct() {
		
		return fictionFXProduct;
	}

}
