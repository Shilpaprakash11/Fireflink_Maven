package org.automation.element_repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
	@FindBy(className="ico-register")
	private WebElement registerLink;
	
	@FindBy(linkText="Log in")
	private WebElement loginLink;
	
	@FindBy(xpath  = "//a[@class='ico-logout']")
	private WebElement logoutLink;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	private WebElement wishListLink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitalDownloadLink;
	
	//a[contains(text(),'Computers')]   
	@FindBy(xpath  = "//a[contains(text(),'Apparel & Shoes')]")
	private WebElement apparelshoelink;
	
	public WebElement getApparelshoelink() {
		return apparelshoelink;
	}

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRegisterLink()
	{
		return registerLink;
	}
	
	public WebElement getLoginLink() {
		return loginLink;
	}

	

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	
	public WebElement getWishListLink() {
		return wishListLink;
	}

	

	public WebElement getBooksLink() {
		return booksLink;
	}

	
	public WebElement getDigitalDownloadLink() {
		return digitalDownloadLink;
	}

	

	

}
