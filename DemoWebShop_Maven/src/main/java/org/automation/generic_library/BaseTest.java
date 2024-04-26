package org.automation.generic_library;

import java.io.IOException;
import java.time.Duration;

import org.automation.element_repository.HomePage;
import org.automation.element_repository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


//changes made by shilpa
public class BaseTest implements FrameworkConstant{
	DataUtility data_utility=new DataUtility();
	public static WebDriver driver;
	public HomePage home_page;
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws IOException {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait_Time));
		driver.get(data_utility.getDataFromPropertiesFile("url"));
	
	}
	
	@BeforeMethod(alwaysRun = true)
	public void performLogin() throws IOException {
		 home_page=new HomePage(driver);
		home_page.getLoginLink().click();
		LoginPage login_page = new LoginPage(driver);
		login_page.getEmailTextField().sendKeys(data_utility.getDataFromPropertiesFile("email"));
		login_page.getPasswordTxtField().sendKeys(data_utility.getDataFromPropertiesFile("pwd"));
		login_page.getLoginButton().click();
	}
	
	@AfterMethod(alwaysRun = true)
	public void performLogout() {
		home_page.getLogoutLink().click();
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.close();
	}
}
