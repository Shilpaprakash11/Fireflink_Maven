package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailWishlist {
	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement emailFriend;
	
	@FindBy(id="FriendEmail")
	private WebElement friendmail;
	

	
	public WebElement getEmailFriend() {
		return emailFriend;
	}


	public void setEmailFriend(WebElement emailFriend) {
		this.emailFriend = emailFriend;
	}


	public WebElement getFriendmail() {
		return friendmail;
	}


	public void setFriendmail(WebElement friendmail) {
		this.friendmail = friendmail;
	}


	public EmailWishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
