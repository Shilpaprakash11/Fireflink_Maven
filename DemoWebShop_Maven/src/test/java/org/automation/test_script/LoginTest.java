package org.automation.test_script;

import java.io.IOException;
import java.time.Duration;

import org.automation.element_repository.HomePage;
import org.automation.element_repository.LoginPage;
import org.automation.generic_library.DataUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
public void testCase() throws IOException {
		DataUtility data_Utility = new DataUtility();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_Utility.getDataFromPropertiesFile("url"));
		
		HomePage home_Page = new HomePage(driver);
		home_Page.getLoginLink().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "Login Page is Not Displayed.."); 
		Reporter.log("Login Page is  Displayed..", true);

		LoginPage login_Page = new LoginPage(driver);
		login_Page.getEmailTextField().sendKeys(data_Utility.getDataFromPropertiesFile("email"));
		login_Page.getPasswordTxtField().sendKeys(data_Utility.getDataFromPropertiesFile("pwd"));
		login_Page.getLoginButton().click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "Home Page is Not Displayed.."); 
		Reporter.log("Home Page is  Displayed..", true);
		
		
		home_Page.getLogoutLink().click();
		driver.close();
		
		
}
}
